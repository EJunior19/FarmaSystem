package com.farmasystem.venta.controller;

import com.farmasystem.venta.entity.VentaDetalle;
import com.farmasystem.venta.service.VentaDetalleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/venta-detalles")
public class VentaDetalleController {

    private final VentaDetalleService ventaDetalleService;

    public VentaDetalleController(VentaDetalleService ventaDetalleService) {
        this.ventaDetalleService = ventaDetalleService;
    }

    @PostMapping
    public ResponseEntity<VentaDetalle> guardar(@RequestBody VentaDetalle ventaDetalle) {
        VentaDetalle nuevoDetalle = ventaDetalleService.guardar(ventaDetalle);
        return new ResponseEntity<>(nuevoDetalle, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<VentaDetalle>> listar() {
        return ResponseEntity.ok(ventaDetalleService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VentaDetalle> buscarPorId(@PathVariable Long id) {
        return ventaDetalleService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}