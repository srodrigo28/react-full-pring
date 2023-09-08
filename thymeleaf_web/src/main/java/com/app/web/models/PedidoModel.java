package com.app.web.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PedidoModel {

    private String nome;
    private Float valor;
    private LocalDate data_Entrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;
    
}
