package com.farmasystem.compra.service;

import com.farmasystem.compra.entity.CompraDetalle;

import java.util.List;
import java.util.Optional;

public interface CompraDetalleService {

    CompraDetalle guardar(CompraDetalle compraDetalle);

    List<CompraDetalle> listar();

    Optional<CompraDetalle> buscarPorId(Long id);

    void eliminar(Long id);
}