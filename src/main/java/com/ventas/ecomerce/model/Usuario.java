package com.ventas.ecomerce.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    public Usuario(Integer id,String nombre,String username,String email,String direccion,String telefono,String tipo){

        this.id=id;
        this.nombre=nombre;
        this.username=username;
        this.email=email;
        this.direccion=direccion;
        this.telefono=telefono;
        this.tipo=tipo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String username;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;

    @OneToMany(mappedBy = "usuario")
    private List<Producto> productos;

    @OneToMany(mappedBy = "usuario")
    private List<Orden> ordenes;

}
