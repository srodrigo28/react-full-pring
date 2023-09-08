package com.sebapp.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.sebapp.api.models.ProdutoModel;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Long> {
    
}
