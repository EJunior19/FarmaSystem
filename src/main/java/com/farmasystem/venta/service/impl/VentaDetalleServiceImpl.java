package com.farmasystem.venta.service.impl;

import com.farmasystem.venta.entity.VentaDetalle;
import com.farmasystem.venta.repository.VentaDetalleRepository;
import com.farmasystem.venta.service.VentaDetalleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaDetalleServiceImpl implements VentaDetalleService {

    private final VentaDetalleRepository ventaDetalleRepository;

    public VentaDetalleServiceImpl(VentaDetalleRepository ventaDetalleRepository) {
        this.ventaDetalleRepository = ventaDetalleRepository;
    }

    @Override
    public VentaDetalle guardar(VentaDetalle ventaDetalle) {
        return ventaDetalleRepository.save(ventaDetalle);
    }

    @Override
    public List<VentaDetalle> listar() {
        return ventaDetalleRepository.findAll();
    }

    @Override
    public Optional<VentaDetalle> buscarPorId(Long id) {
        return ventaDetalleRepository.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        ventaDetalleRepository.deleteById(id);
    }
}