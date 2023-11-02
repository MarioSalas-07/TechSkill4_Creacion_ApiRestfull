package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "carrito_productos")
@Getter
@Setter
public class CarritoProductos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;
    private byte estatus;
    @ManyToOne
    @JoinColumn(name = "id_carrito")
    private Carrito carrito;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public CarritoProductos() {
    }

    public CarritoProductos(Long id, int cantidad, Carrito carrito, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.carrito = carrito;
        this.producto = producto;
    }
}
