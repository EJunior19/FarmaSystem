package com.farmasystem.compra.service;

import com.farmasystem.compra.entity.Compra;

import java.util.List;
import java.util.Optional;

public interface CompraService {
    Compra guardar(Compra compra);
    List<Compra> listar();
    Optional<Compra> buscarPorId(Long id);
}