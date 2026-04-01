package com.farmasystem.marca.repository;

import com.farmasystem.marca.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}