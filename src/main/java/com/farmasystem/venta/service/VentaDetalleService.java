package com.farmasystem.venta.service;

import com.farmasystem.venta.entity.VentaDetalle;

import java.util.List;
import java.util.Optional;

public interface VentaDetalleService {

    VentaDetalle guardar(VentaDetalle ventaDetalle);

    List<VentaDetalle> listar();

    Optional<VentaDetalle> buscarPorId(Long id);

    void eliminar(Long id);
}