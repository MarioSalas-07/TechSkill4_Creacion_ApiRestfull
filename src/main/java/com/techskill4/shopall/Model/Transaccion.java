package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Transacciones")
@Getter
@Setter
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal monto_total;
    private String direccion_envio;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "id_carrito")
    private Carrito carrito;

    public Transaccion() {
    }

    public Transaccion(Long id, BigDecimal monto_total, String direccion_envio, Date fecha, Carrito carrito) {
        this.id = id;
        this.monto_total = monto_total;
        this.direccion_envio = direccion_envio;
        this.fecha = fecha;
        this.carrito = carrito;
    }
}