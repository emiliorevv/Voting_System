package com.example.voting_system.repository;

import com.example.voting_system.Enum.Role;
import com.example.voting_system.model.Usuario;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    @Override
    Optional<Usuario> findById(Long aLong);

    boolean existsById(Long aLong);

    Optional<Usuario> findByNombre(String nombre);

    boolean existsByNombre(String nombre);

    Optional<Usuario> findByEmail(String email);

    boolean existsByEmail(String email);

    Optional<Usuario> findByRole(Role role);

    boolean existsByRole(Role role);

    @Override
    <S extends Usuario> S save(S entity);
}
