package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Empresa")
@Getter
@Setter
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String whatsApp;
    private String direccion;
    private byte status;
    private String descripcion;
    private String imagen;

    public Empresa() {
    }

    public Empresa(Long id, String nombre, String whatsApp, String direccion, byte status, String descripcion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.whatsApp = whatsApp;
        this.direccion = direccion;
        this.status = status;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
}