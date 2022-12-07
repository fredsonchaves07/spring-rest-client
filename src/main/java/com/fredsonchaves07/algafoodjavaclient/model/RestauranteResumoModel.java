package com.fredsonchaves07.algafoodjavaclient.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RestauranteResumoModel {

    private Long id;

    private String nome;

    private BigDecimal taxaFrete;

    private CozinhaModel cozinha;
}