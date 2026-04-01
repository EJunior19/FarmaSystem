package com.farmasystem.movimiento.repository;

import com.farmasystem.movimiento.entity.MovimientoStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoStockRepository extends JpaRepository<MovimientoStock, Long> {
}