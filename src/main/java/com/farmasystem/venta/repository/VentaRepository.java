package com.farmasystem.venta.repository;

import com.farmasystem.venta.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}