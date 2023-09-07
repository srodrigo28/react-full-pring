package com.produto.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.produto.api.model.ProdutoModel;
import com.produto.api.model.RespostaModelo;
import com.produto.api.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private RespostaModelo mesagem;
    // Methodo de listar todos
    public Iterable<ProdutoModel> listeAll() {
        return repository.findAll();
    }

    // Cadastrar alterar
    public ResponseEntity<?> cadastrar(ProdutoModel produto) {
        if (produto.getNome().equals("")) {
            mesagem.setMensagem("O nome do produto é Obrigatório!");
            return new ResponseEntity<RespostaModelo>(mesagem, HttpStatus.BAD_REQUEST);
        } else if (produto.getMarca().equals("")) {
            mesagem.setMensagem("A marca é obrigatória");
            return new ResponseEntity<RespostaModelo>(mesagem, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<ProdutoModel>(repository.save(produto), HttpStatus.CREATED);
        }
    }
    
        // Cadastrar alterar
        public ResponseEntity<?> alterar(ProdutoModel produto) {
        if (produto.getCodigo().equals("")) {
            mesagem.setMensagem("Código Obrigatório!");
            return new ResponseEntity<RespostaModelo>(mesagem, HttpStatus.BAD_REQUEST);
        } 
        else if (produto.getNome().equals("")) {
            mesagem.setMensagem("O nome do produto é Obrigatório!");
            return new ResponseEntity<RespostaModelo>(mesagem, HttpStatus.BAD_REQUEST);
        } else if (produto.getMarca().equals("")) {
            mesagem.setMensagem("A marca é obrigatória");
            return new ResponseEntity<RespostaModelo>(mesagem, HttpStatus.BAD_REQUEST);
        } else {
                return new ResponseEntity<ProdutoModel>(repository.save(produto), HttpStatus.OK);
        }
    }
    
    // exluir
    public ResponseEntity<ProdutoModel> remover(long codigo) {
        repository.deleteById(codigo);

        mesagem.setMensagem("Excluído com sucesso!");
        return new ResponseEntity<ProdutoModel>(HttpStatus.OK);
    }
}
