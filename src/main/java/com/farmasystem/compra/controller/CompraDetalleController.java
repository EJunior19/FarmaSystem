package com.farmasystem.compra.controller;

import com.farmasystem.compra.entity.CompraDetalle;
import com.farmasystem.compra.service.CompraDetalleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compra-detalles")
public class CompraDetalleController {

    private final CompraDetalleService compraDetalleService;

    public CompraDetalleController(CompraDetalleService compraDetalleService) {
        this.compraDetalleService = compraDetalleService;
    }

    @PostMapping
    public ResponseEntity<CompraDetalle> guardar(@RequestBody CompraDetalle compraDetalle) {
        CompraDetalle nuevo = compraDetalleService.guardar(compraDetalle);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CompraDetalle>> listar() {
        return ResponseEntity.ok(compraDetalleService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompraDetalle> buscarPorId(@PathVariable Long id) {
        return compraDetalleService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        compraDetalleService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}