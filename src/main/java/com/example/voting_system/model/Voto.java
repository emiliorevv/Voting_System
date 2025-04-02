package com.example.voting_system.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Voto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private boolean voto;
    private LocalDateTime fechaVoto;

    @ManyToOne
    @JoinColumn(name = "Cantidad de votos")
    private Candidato candidato;

    @OneToMany(mappedBy = "Voto efectuado")
    private java.util.List<Usuario> usuarios;



    public Voto() {

    }

    public Voto(long id, boolean voto, LocalDateTime fechaVoto) {
        this.id = id;
        this.voto = voto;
        this.fechaVoto = fechaVoto;
    }

    public void SetId(long id) {
        this.id = id;
    }

    public long GetId() {
        return this.id;
    }


    public void SetVoto(boolean voto) {
        this.voto = voto;
    }

    public boolean GetVoto() {
        return this.voto;
    }

    public void SetFechaVoto(LocalDateTime fechaVoto) {
        this.fechaVoto = fechaVoto;
    }

    public LocalDateTime GetFechaVoto() {
        return this.fechaVoto;
    }


    public void registrarVoto() {
        //Verifica que eleccion este activa
        //Comprueba que usuario no haya votado
        //Anonimiza si es necesario
        //Persiste el voto
    }
}

