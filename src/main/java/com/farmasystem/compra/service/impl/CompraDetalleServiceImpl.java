package com.farmasystem.compra.service.impl;

import com.farmasystem.compra.entity.CompraDetalle;
import com.farmasystem.compra.repository.CompraDetalleRepository;
import com.farmasystem.compra.service.CompraDetalleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraDetalleServiceImpl implements CompraDetalleService {

    private final CompraDetalleRepository compraDetalleRepository;

    public CompraDetalleServiceImpl(CompraDetalleRepository compraDetalleRepository) {
        this.compraDetalleRepository = compraDetalleRepository;
    }

    @Override
    public CompraDetalle guardar(CompraDetalle compraDetalle) {
        return compraDetalleRepository.save(compraDetalle);
    }

    @Override
    public List<CompraDetalle> listar() {
        return compraDetalleRepository.findAll();
    }

    @Override
    public Optional<CompraDetalle> buscarPorId(Long id) {
        return compraDetalleRepository.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        compraDetalleRepository.deleteById(id);
    }
}