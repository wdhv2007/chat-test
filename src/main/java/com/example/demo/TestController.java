package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author : zenic
 * Created : 2019-05-18
 */
@Controller
public class TestController {

  @GetMapping("/")
  public String index() {
    return "index";
  }
}
