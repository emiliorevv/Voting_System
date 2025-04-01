package com.example.voting_system.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import com.example.voting_system.Enum.Role;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String password;
    private String email;
    //@Enumerated(EnumType.STRING)
    private Role role;

    public Usuario() {

    }

    public Usuario(long id, String nombre, String password, String email, Role role) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public void SetId(long id) {
        this.id = id;
    }

    public long GetId() {
        return this.id;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String GetNombre() {
        return this.nombre;
    }

    public void SetPassword(String password) {
        this.password = password;
    }

    public String GetPassword() {
        return this.password;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public String GetEmail() {
        return this.email;
    }

    public void SetRole(Role role) {
        this.role = role;
    }

    public Role GetRole() {
        return this.role;
    }

    public void registrarse() {
        //valida datos de entrada (mail, contraseña)
        //verifica que el usuario no exista
        //codifica la contraseña
        //persiste el usuario

    }

    public void iniciarSesion() {
        //Verifica credenciales
        //Genera token/sesion
        //Registra tiempo de inicio
    }

    public void votar() {
        //Verifica elegibilidad(que el usuario no haya elegido antes)
        //Registra voto
        //Confirma operacion
    }
}

