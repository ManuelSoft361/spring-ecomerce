package com.ventas.ecomerce.service;

import com.ventas.ecomerce.model.Orden;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrdenService {

    List<Orden> findAll();
    Orden save(Orden orden);

}
