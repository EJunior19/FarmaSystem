package com.farmasystem.movimiento.controller;

import com.farmasystem.movimiento.entity.MovimientoStock;
import com.farmasystem.movimiento.service.MovimientoStockService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoStockController {

    private final MovimientoStockService movimientoStockService;

    public MovimientoStockController(MovimientoStockService movimientoStockService) {
        this.movimientoStockService = movimientoStockService;
    }

    @PostMapping
    public ResponseEntity<MovimientoStock> guardar(@RequestBody MovimientoStock movimientoStock) {
        MovimientoStock nuevoMovimiento = movimientoStockService.guardar(movimientoStock);
        return new ResponseEntity<>(nuevoMovimiento, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MovimientoStock>> listar() {
        return ResponseEntity.ok(movimientoStockService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovimientoStock> buscarPorId(@PathVariable Long id) {
        return movimientoStockService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}