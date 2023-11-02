package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Usuario_has_roles")
@Getter
@Setter
public class UsuarioRol {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public UsuarioRol() {
    }

    public UsuarioRol(Rol rol, Usuario usuario) {
        this.rol = rol;
        this.usuario = usuario;
    }
}
