package com.fredsonchaves07.algafoodjavaclient.api;

import org.springframework.web.client.RestTemplate;

public class ListagemRestauranteMain {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        RestauranteClient restauranteClient = new RestauranteClient(restTemplate, "http://localhost:8080");
        restauranteClient.listar().forEach(System.out::println);
    }
}
