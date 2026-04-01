package com.farmasystem.cliente.service;

import com.farmasystem.cliente.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente guardar(Cliente cliente);
    List<Cliente> listar();
    Optional<Cliente> buscarPorId(Long id);
}