package com.br.fiap.checkpoint.repository;

import com.br.fiap.checkpoint.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
