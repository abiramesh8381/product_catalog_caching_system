package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.product.enties.Product;
import com.product.repositories.ProductDao;

@Service

public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	public Product save(Product product) {
		return productDao.save(product);
	}
	//@CachePut(key="#product.id",value="Product")
	public Product updateProduct(Product product) {
		return productDao.updateProduct(product);
	}
	
	public List<Product> findAll(){
		return productDao.findAll();
	}
	//@Cacheable(key="#id",value="Product")
	public Product findProductById(int id){
		return productDao.findProductById(id);
	}
	
	//@CacheEvict(key="#id",value="Product")
	public String delete(int id){
		 productDao.deleteProduct(id);
		 return "deleted";
	}

}
