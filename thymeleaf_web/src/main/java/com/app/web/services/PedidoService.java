package com.app.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.models.PedidoModel;
import com.app.web.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    // Methodo de listar todos
    public Iterable<PedidoModel> listeAll() {
        return repository.findAll();
    }
    
}
