package com.generation.staffcore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.staffcore.Model.Colaborador;

import java.util.List;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

    public List<Colaborador> findAllByIdContaining(Long id);
    public List<Colaborador> findAllByNomeCompletoContaining(String nome);

}
