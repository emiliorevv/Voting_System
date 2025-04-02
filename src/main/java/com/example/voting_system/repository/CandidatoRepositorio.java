package com.example.voting_system.repository;

import com.example.voting_system.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidatoRepositorio extends JpaRepository<Candidato, Long> {

    @Override
    Optional<Candidato> findById(Long aLong);

    boolean existsById(Long aLong);


    Optional<Candidato> findByNombre(String nombre);

    boolean existsByNombre(String nombre);

    @Override
    <S extends Candidato> S save(S entity);


}
