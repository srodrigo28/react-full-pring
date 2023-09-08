package com.sebapp.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sebapp.api.models.ProdutoModel;
import com.sebapp.api.repository.ProdutoRepository;
import com.sebapp.api.services.ProdutoService;

@RestController
public class ProdutoController {
    
    @Autowired
    private ProdutoService service;

    @Autowired
    private ProdutoRepository repository;

    // Cadastrar Produtos
    @PostMapping("/produto/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModel model){
        return service.cadastrar(model);
    }

    // Listar Produtos
    @GetMapping("produto/listar")
    public Iterable<ProdutoModel> listar(){
        return service.listeAll();
    }

    // Deletar Produto
    @DeleteMapping("produto/remover/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PostMapping("/produto/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModel model) {
        return service.alterar(model);
    }
}
