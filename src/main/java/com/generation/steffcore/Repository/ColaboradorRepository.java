package com.generation.steffcore.Repository;

import com.generation.steffcore.Model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

    public List<Colaborador> findAllByIdContaining(String nome);

}
