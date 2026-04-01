package com.farmasystem.compra.repository;

import com.farmasystem.compra.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}