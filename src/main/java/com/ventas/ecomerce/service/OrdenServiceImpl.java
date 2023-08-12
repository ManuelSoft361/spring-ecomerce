package com.ventas.ecomerce.service;

import com.ventas.ecomerce.model.Orden;
import com.ventas.ecomerce.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServiceImpl implements OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;
    @Override
    public Orden save(Orden orden) {
        return ordenRepository.save(orden);
    }
}
