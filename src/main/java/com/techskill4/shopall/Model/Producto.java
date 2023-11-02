package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Productos")
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int cantidad;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaProducto categoriaProducto;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Producto() {
    }

    public Producto(Long id, String nombre, String descripcion, float precio, int cantidad, CategoriaProducto categoriaProducto, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoriaProducto = categoriaProducto;
        this.usuario = usuario;
    }
}