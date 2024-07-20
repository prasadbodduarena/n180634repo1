package com.nit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-api")
public class ProductOperationsController {
    @GetMapping("/details/{name}/{price}")
	public ResponseEntity<String> showProducts(@PathVariable String name,@PathVariable Double price){
    	return new ResponseEntity<String>("Product Name ::"+name+" & its Price::"+price,HttpStatus.CREATED);
    }
}
