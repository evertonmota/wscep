package com.example.openfeign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {

    private final WebClient userClient;

    public Initializer(WebClient userClient) {
        this.userClient = userClient;
    }

    @Override
    public void run(String... args) throws Exception {
        CepDTO cepDTO = userClient.buscaCep("26087410");
        System.out.println(cepDTO);
    }
}
