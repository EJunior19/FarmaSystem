package com.farmasystem.movimiento.service;

import com.farmasystem.movimiento.entity.MovimientoStock;

import java.util.List;
import java.util.Optional;

public interface MovimientoStockService {
    MovimientoStock guardar(MovimientoStock movimientoStock);
    List<MovimientoStock> listar();
    Optional<MovimientoStock> buscarPorId(Long id);
}