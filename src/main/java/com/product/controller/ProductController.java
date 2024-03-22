package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.enties.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping
	public Product save(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@GetMapping
	public List<Product> findAll() {
		return productService.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable int id ) {
		return productService.findProductById(id);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id ) {
		return productService.delete(id);
	}
}
