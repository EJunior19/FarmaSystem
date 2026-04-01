package com.farmasystem.marca.service.impl;

import com.farmasystem.marca.entity.Marca;
import com.farmasystem.marca.repository.MarcaRepository;
import com.farmasystem.marca.service.MarcaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository marcaRepository;

    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public Marca guardar(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public List<Marca> listar() {
        return marcaRepository.findAll();
    }

    @Override
    public Optional<Marca> buscarPorId(Long id) {
        return marcaRepository.findById(id);
    }
}