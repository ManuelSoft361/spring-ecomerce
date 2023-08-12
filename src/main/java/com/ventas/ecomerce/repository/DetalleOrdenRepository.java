package com.ventas.ecomerce.repository;

import com.ventas.ecomerce.model.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {
}
