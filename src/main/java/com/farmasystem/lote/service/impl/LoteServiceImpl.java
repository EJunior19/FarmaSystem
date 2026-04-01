package com.farmasystem.lote.service.impl;

import com.farmasystem.lote.entity.Lote;
import com.farmasystem.lote.repository.LoteRepository;
import com.farmasystem.lote.service.LoteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoteServiceImpl implements LoteService {

    private final LoteRepository loteRepository;

    public LoteServiceImpl(LoteRepository loteRepository) {
        this.loteRepository = loteRepository;
    }

    @Override
    public Lote guardar(Lote lote) {
        return loteRepository.save(lote);
    }

    @Override
    public List<Lote> listar() {
        return loteRepository.findAll();
    }

    @Override
    public Optional<Lote> buscarPorId(Long id) {
        return loteRepository.findById(id);
    }
}