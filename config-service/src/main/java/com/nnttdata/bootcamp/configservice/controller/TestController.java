package com.nnttdata.bootcamp.configservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//accede a valor product-name del repositorio de git
//se conecta desde el configserver configurada su conexion en el yml
    @Value("${product.product-name}")
    private String myProduct;
    
    @GetMapping(path="/getProductName")
    public String myProduct() {
   	 return this.myProduct;
    }
}

