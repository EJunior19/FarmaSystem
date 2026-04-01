package com.farmasystem.categoria.service;

import com.farmasystem.categoria.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    Categoria guardar(Categoria categoria);
    List<Categoria> listar();
    Optional<Categoria> buscarPorId(Long id);
}