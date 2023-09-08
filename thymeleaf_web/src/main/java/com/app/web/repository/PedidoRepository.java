package com.app.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.web.models.PedidoModel;

public interface PedidoRepository extends CrudRepository<PedidoModel, Long>{
    
}