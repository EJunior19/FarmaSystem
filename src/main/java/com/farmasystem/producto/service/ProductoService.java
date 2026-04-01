package com.farmasystem.producto.service;

import com.farmasystem.producto.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    Producto guardar(Producto producto);
    List<Producto> listar();
    Optional<Producto> buscarPorId(Long id);
}