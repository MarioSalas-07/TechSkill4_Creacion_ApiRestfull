package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Usuario")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private byte status;
    private String usuario;
    private String contrasenia;
    private String correo_electronico;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    public Usuario() {
    }

    public Usuario(Long id, byte status, String usuario, String contrasenia, String correo_electronico, Persona persona, Empresa empresa) {
        this.id = id;
        this.status = status;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.correo_electronico = correo_electronico;
        this.persona = persona;
        this.empresa = empresa;
    }
}