package com.ust.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

  @Value("${server.port}")
  int port;

  @GetMapping("/hello")
  String hello() {
    return "hello from demo-service on port " + port;
  }
}
