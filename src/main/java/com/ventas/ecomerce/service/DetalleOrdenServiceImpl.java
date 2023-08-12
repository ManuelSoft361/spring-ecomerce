package com.ventas.ecomerce.service;

import com.ventas.ecomerce.model.DetalleOrden;
import com.ventas.ecomerce.repository.DetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenServiceImpl implements DetalleOrdenService{

    @Autowired
    private DetalleOrdenRepository detalleOrdenRepository;
    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleOrdenRepository.save(detalleOrden);
    }
}
