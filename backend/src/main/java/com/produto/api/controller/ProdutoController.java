package com.produto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.produto.api.model.ProdutoModel;
import com.produto.api.model.RespostaModelo;
import com.produto.api.repository.ProdutoRepository;
import com.produto.api.service.ProdutoService;

@RestController
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @Autowired
    private RespostaModelo message;

    @Autowired
    private ProdutoRepository repository;

    // Listar
    @GetMapping("/produto/listar")
    public Iterable<ProdutoModel> listar() {
        return service.listeAll();
    }

    // Excluir
    @DeleteMapping("/produto/remover/{codigo}")
    public ResponseEntity<RespostaModelo> remover(Long codigo) {
        repository.deleteById(codigo);

        message.setMensagem("Removido com sucesso");
        return new ResponseEntity<RespostaModelo>(message, HttpStatus.OK);
    }

    // Cadastrar
    @PostMapping("/produto/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModel model) {
        return service.cadastrar(model);
    }
    
    // Alterar
    @PostMapping("/produto/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModel model) {
        return service.alterar(model);
    }
        
}
