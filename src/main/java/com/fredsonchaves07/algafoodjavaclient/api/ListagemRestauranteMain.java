package com.fredsonchaves07.algafoodjavaclient.api;

import org.springframework.web.client.RestTemplate;

public class ListagemRestauranteMain {

    public static void main(String[] args) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            RestauranteClient restauranteClient = new RestauranteClient(restTemplate, "http://localhost:8080");
            restauranteClient.listar().forEach(System.out::println);
        } catch (ClientApiException e) {
            System.out.println(e.getProblem());
        }
    }
}
