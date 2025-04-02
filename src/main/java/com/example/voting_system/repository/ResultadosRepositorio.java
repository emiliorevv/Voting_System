package com.example.voting_system.repository;

import com.example.voting_system.model.Resultados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ResultadosRepositorio extends JpaRepository<Resultados, Long> {


    @Override
    Optional<Resultados> findById(Long aLong);

    Boolean existsById(long id);
}
