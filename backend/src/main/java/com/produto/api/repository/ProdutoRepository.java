package com.produto.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.produto.api.model.ProdutoModel;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Long>{
    
}
