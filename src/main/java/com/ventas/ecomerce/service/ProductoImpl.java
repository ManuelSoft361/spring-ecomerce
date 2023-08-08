package com.ventas.ecomerce.service;

import com.ventas.ecomerce.model.Producto;
import com.ventas.ecomerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public Producto Save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void update(Producto producto) {

        productoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {

        productoRepository.deleteById(id);
    }
}