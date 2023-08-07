package com.ventas.ecomerce.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "orden")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_recibido")
    private Date fechaRecibido;

    private double total;

}
