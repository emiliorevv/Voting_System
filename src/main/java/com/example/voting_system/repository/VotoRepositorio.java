package com.example.voting_system.repository;

import com.example.voting_system.model.Voto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VotoRepositorio extends JpaRepository<Voto, Long> {

    @Override
    Optional<Voto> findById(Long aLong);

    boolean existsById(Long aLong);

    @Override
    <S extends Voto> S save(S entity);
}
