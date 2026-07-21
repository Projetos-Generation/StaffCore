package com.generation.steffcore.Controller;

import com.generation.steffcore.Model.Colaborador;
import com.generation.steffcore.Repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/colaborador")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ColaboradorController {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @GetMapping
    public ResponseEntity<List<Colaborador>> getAll(){
        return ResponseEntity.ok (colaboradorRepository.findAll ());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Colaborador> getById(@PathVariable long id ){
        return colaboradorRepository.findById (id)
                //validação
                .map (resposta -> ResponseEntity.ok (resposta))
                .orElse (ResponseEntity.notFound ().build ());
    }

    //consulta personalizada
    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Colaborador>>getAllByTitulo(@PathVariable String nome){
        return ResponseEntity.ok (colaboradorRepository.findAllByIdContaining (nome));
    }

    //Criação de dados
    @PostMapping
    public ResponseEntity<Colaborador>post(@RequestBody Colaborador colaborador){
        return ResponseEntity.status (HttpStatus.CREATED)
                .body(colaboradorRepository.save(colaborador));
    }

    //Atualização de dados
    @PutMapping
    public ResponseEntity<Colaborador>put(@RequestBody Colaborador colaborador){
        if (colaboradorRepository.existsById (colaborador.getId ()))
            return ResponseEntity.ok (colaboradorRepository.save (colaborador));
        return ResponseEntity.notFound ().build ();
    }

    //Delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        Optional<Colaborador> postagem = colaboradorRepository.findById (id);
        if (postagem.isEmpty ())
            throw new ResponseStatusException (HttpStatus.NOT_FOUND);

        colaboradorRepository.deleteById (id);
    }
}
