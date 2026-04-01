package com.farmasystem.marca.service;

import java.util.List;
import java.util.Optional;

import com.farmasystem.marca.entity.Marca;

public interface MarcaService {
    Marca guardar(Marca marca);
    List<Marca> listar();
    Optional<Marca> buscarPorId(Long id);
}