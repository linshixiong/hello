package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
  @RequestMapping("/")
  public String index() {
    return "Hello emdoor BU2";
  }


  @RequestMapping("/test")
  public String test(String name) {
    return "Your name is "+name;
  }
}
