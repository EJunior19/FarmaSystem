package com.farmasystem.lote.repository;

import com.farmasystem.lote.entity.Lote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoteRepository extends JpaRepository<Lote, Long> {
}