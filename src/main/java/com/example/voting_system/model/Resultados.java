package com.example.voting_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Resultados {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int cantidadVotos;

    public Resultados(){

    }

    public Resultados(long id, int cantidadVotos){
        this.id = id;
        this.cantidadVotos = cantidadVotos;
    }

    public void SetId(long id){
        this.id = id;
    }

    public long GetId(){
        return this.id;
    }

    public void SetCantidadVotos(int cantidadVotos){
        this.cantidadVotos = cantidadVotos;
    }

    public int GetCantidadVotos(){
        return this.cantidadVotos;
    }


    public void calcularResultados(){
        //Obtiene todos los votos de una eleccion
        //Agrupa por candidato
        //Calcula estadisticas
        //Guarda resultados
    }
}

