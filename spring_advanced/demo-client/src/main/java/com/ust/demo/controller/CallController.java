package com.ust.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;


@RestController
class CallController {

  private final WebClient.Builder lbWebClient;

  CallController(WebClient.Builder lbWebClient) {
    this.lbWebClient = lbWebClient;
  }

  @GetMapping("/call")
  Mono<String> call() {
    return lbWebClient.build()
        .get()
        .uri("http://demo-service/hello")
        .retrieve()
        .bodyToMono(String.class);
  }
}