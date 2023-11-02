package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Persona")
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String calle;
    private int num_ext;
    private Integer num_int;
    private int cp;
    private String ciudad;
    private String telefono;
    private String colonia;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido_paterno, String apellido_materno, String calle, int num_ext, Integer num_int, int cp, String ciudad, String telefono, String colonia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.calle = calle;
        this.num_ext = num_ext;
        this.num_int = num_int;
        this.cp = cp;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.colonia = colonia;
    }
}