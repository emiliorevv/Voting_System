package com.example.voting_system.model;
import jakarta.persistence.*;

@Entity
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String descripcion;
    private String imagen;

    @OneToMany(mappedBy = "Cantidad de votos") //Funciona para la bidireccionalidad de la columna de la tabla
    private java.util.List<Voto> votos;



    public Candidato(){

    }

    public Candidato(long id, String nombre, String descripcion, String imagen){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public void SetId(long id){
        this.id = id;
    }

    public long GetId(){
        return this.id;
    }

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public String GetNombre(){
        return this.nombre;
    }

    public void SetDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String GetDescripcion(){
        return this.descripcion;
    }

    public void SetImagen(String imagen){
        this.imagen = imagen;
    }

    public String GetImagen(){
        return this.imagen;
    }


    public void obtenerVotos(){


        //cuenta los votos asociados
        //calcula porcentaje sobre total
        //devuelve estadisticas
    }

}

