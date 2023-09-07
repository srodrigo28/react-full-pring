package com.produto.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.produto.api.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends CrudRepository<ProdutoModel, Long>{
    
}
