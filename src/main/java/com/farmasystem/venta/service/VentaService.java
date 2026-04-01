package com.farmasystem.venta.service;

import com.farmasystem.venta.entity.Venta;

import java.util.List;
import java.util.Optional;

public interface VentaService {
    Venta guardar(Venta venta);
    List<Venta> listar();
    Optional<Venta> buscarPorId(Long id);
}