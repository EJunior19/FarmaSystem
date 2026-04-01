package com.farmasystem.movimiento.service.impl;

import com.farmasystem.movimiento.entity.MovimientoStock;
import com.farmasystem.movimiento.repository.MovimientoStockRepository;
import com.farmasystem.movimiento.service.MovimientoStockService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoStockServiceImpl implements MovimientoStockService {

    private final MovimientoStockRepository movimientoStockRepository;

    public MovimientoStockServiceImpl(MovimientoStockRepository movimientoStockRepository) {
        this.movimientoStockRepository = movimientoStockRepository;
    }

    @Override
    public MovimientoStock guardar(MovimientoStock movimientoStock) {
        return movimientoStockRepository.save(movimientoStock);
    }

    @Override
    public List<MovimientoStock> listar() {
        return movimientoStockRepository.findAll();
    }

    @Override
    public Optional<MovimientoStock> buscarPorId(Long id) {
        return movimientoStockRepository.findById(id);
    }
}