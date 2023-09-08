package com.sebapp.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "produtos")
public class ProdutoModel {
   
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique=true)
    private String nome;
    private String descricao;
    private Float valor;
}
