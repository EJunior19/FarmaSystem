package com.farmasystem.lote.service;

import com.farmasystem.lote.entity.Lote;

import java.util.List;
import java.util.Optional;

public interface LoteService {
    Lote guardar(Lote lote);
    List<Lote> listar();
    Optional<Lote> buscarPorId(Long id);
}