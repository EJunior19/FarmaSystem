package com.farmasystem.funcionario.service;

import com.farmasystem.funcionario.entity.Funcionario;

import java.util.List;
import java.util.Optional;

public interface FuncionarioService {
    Funcionario guardar(Funcionario funcionario);
    List<Funcionario> listar();
    Optional<Funcionario> buscarPorId(Long id);
}