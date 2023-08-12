package com.ventas.ecomerce.service;

import com.ventas.ecomerce.model.DetalleOrden;
import org.springframework.stereotype.Service;

@Service
public interface DetalleOrdenService {
    DetalleOrden save(DetalleOrden detalleOrden);
}
