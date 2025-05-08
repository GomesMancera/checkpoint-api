package com.br.fiap.checkpoint.repository;

import com.br.fiap.checkpoint.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
    