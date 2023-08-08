package com.ventas.ecomerce.model;


import jakarta.persistence.*;
import lombok.*;

@Data

@NoArgsConstructor
@Getter
@Setter
@Entity()
@Table(name = "producto")
public class Producto {

    public Producto(Integer id,String nombre,String descripcion, String imagen, double precio, int cantidad){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.imagen=imagen;
        this.precio=precio;
        this.cantidad=cantidad;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private int cantidad;

    @ManyToOne
    public Usuario usuario;


}
