package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "Carrito")
@Getter
@Setter
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal precio_total;
    private int cantidad;
    private byte estatus;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Carrito() {
    }

    public Carrito(Long id, BigDecimal precio_total, Usuario usuario) {
        this.id = id;
        this.precio_total = precio_total;
        this.usuario = usuario;
    }
}