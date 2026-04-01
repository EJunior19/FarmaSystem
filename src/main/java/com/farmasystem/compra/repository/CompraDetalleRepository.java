package com.farmasystem.compra.repository;

import com.farmasystem.compra.entity.CompraDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraDetalleRepository extends JpaRepository<CompraDetalle, Long> {
}