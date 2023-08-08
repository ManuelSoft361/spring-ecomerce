package com.ventas.ecomerce.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orden")
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

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "orden")
    private  DetalleOrden detalleOrden;


}
