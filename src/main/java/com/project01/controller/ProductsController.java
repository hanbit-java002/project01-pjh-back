package com.project01.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project01.service.ProductService;

@RestController
@RequestMapping("/api/main/products/")
public class ProductsController {

	@Autowired
	   private ProductService productService;
	
	@RequestMapping(value="/{productsCode}", method=RequestMethod.GET)
	public Map get(@PathVariable("productsCode") String productsCode) {	
		return productService.get(productsCode);
	}
}
