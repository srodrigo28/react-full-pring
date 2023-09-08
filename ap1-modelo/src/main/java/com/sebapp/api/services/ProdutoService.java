package com.sebapp.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sebapp.api.models.ProdutoModel;
import com.sebapp.api.repository.ProdutoRepository;

import lombok.Data;

@Service
@Data
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository repository;

    // Service :: Cadastrar
    public ResponseEntity<?> cadastrar(ProdutoModel produto){
        return new ResponseEntity<ProdutoModel>(repository.save(produto), HttpStatus.CREATED);
    }

    // Service :: Listar Todos
    public Iterable<ProdutoModel> listeAll(){
        return repository.findAll();
    }

    // Service :: Alterar
    public ResponseEntity<?> alterar(ProdutoModel produto){
        return new ResponseEntity<ProdutoModel>(repository.save(produto), HttpStatus.OK);
    }

    // Service :: Excluir
    public ResponseEntity<ProdutoModel> excluir(long id){
        repository.deleteById(id);
        return new ResponseEntity<ProdutoModel>(HttpStatus.OK);
    }
}
