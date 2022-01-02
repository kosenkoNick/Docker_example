package com.example.docker_example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
  @GetMapping("/")
  public void hello(HttpServletResponse response) throws IOException {
    PrintWriter writer = response.getWriter();
    writer.println("Hello everyone!");
  }
}
