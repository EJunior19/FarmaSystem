package com.farmasystem.funcionario.repository;

import com.farmasystem.funcionario.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}