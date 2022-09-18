package com.teksoi.reactive;

import reactor.core.publisher.Flux;

import java.util.List;

public class ReactiveService {

    public Flux<String> nameFlux() {
        return Flux.fromArray(new String[]{"Zayed", "Nusaiba", "Musfira", "Zuairia"});
    }

    public static void main(String[] args) {
        ReactiveService service = new ReactiveService();
        service.nameFlux().subscribe(s -> {
            System.out.println(s);
        });
    }
}
