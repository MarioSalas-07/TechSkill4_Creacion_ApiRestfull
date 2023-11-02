package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Comentarios")
@Getter
@Setter
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int calificacion;
    private String comentario;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public Comentario() {
    }

    public Comentario(Long id, int calificacion, String comentario, Usuario usuario, Producto producto) {
        this.id = id;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.usuario = usuario;
        this.producto = producto;
    }
}