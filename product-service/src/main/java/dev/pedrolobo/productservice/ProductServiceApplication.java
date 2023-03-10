package dev.pedrolobo.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
@SpringBootApplication
public class ProductServiceApplication {

  @GetMapping()
  public String ss(){
    return "<h1 style=color:deepPink>QUERO IR EMBORAAAA!</h1>";
  }
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
    System.out.println("aaaaaa");
	}

}
