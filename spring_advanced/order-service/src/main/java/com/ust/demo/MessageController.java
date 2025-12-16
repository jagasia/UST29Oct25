package com.ust.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  @Value("${app.message:missing}")
  private String message;

  @GetMapping("/message")
  public String message() {
    return message;
  }
}
