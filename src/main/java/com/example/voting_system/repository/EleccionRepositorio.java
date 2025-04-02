package com.example.voting_system.repository;
import com.example.voting_system.model.Eleccion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleccionRepositorio extends JpaRepository<Eleccion, Long>{

    Optional<Eleccion> findByTitulo(String titulo); //Buscar por el titulo de la eleccion

    boolean existsByTitulo(String titulo); //Buscar si esta eleccion existe o no


    @Override
    Optional<Eleccion> findById(Long aLong);    //buscar por id una eleccion

    boolean existsById(Long aLong); //verificar si existe esa eleccion

    Optional<Eleccion> findByActiva(boolean activa);    //ver que elecciones estan activas

    boolean existsByActiva(boolean activa); //verificar si la eleccion seleccionada esta activa o no

    @Override
    <S extends Eleccion> S save(S entity); //Guardar una eleccion en la base de datos





}
