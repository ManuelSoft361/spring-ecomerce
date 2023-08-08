package com.ventas.ecomerce.service;

import com.ventas.ecomerce.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public Producto Save(Producto producto);
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);

    public  List<Producto> findAll();

}
