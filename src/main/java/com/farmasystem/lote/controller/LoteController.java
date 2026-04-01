package com.farmasystem.lote.controller;

import com.farmasystem.lote.entity.Lote;
import com.farmasystem.lote.service.LoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lotes")
public class LoteController {

    private final LoteService loteService;

    public LoteController(LoteService loteService) {
        this.loteService = loteService;
    }

    @PostMapping
    public ResponseEntity<Lote> guardar(@RequestBody Lote lote) {
        Lote nuevoLote = loteService.guardar(lote);
        return new ResponseEntity<>(nuevoLote, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Lote>> listar() {
        return ResponseEntity.ok(loteService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lote> buscarPorId(@PathVariable Long id) {
        return loteService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}