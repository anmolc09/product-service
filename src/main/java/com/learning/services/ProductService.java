package com.learning.services;

import com.learning.entity.Product;

import java.util.List;

public interface ProductService {
     List<Product> getAllProducts();
     Product getProductById(Long id);
     void addProduct(Product product);
     void addAllProducts(List<Product> productList);
     Boolean updateProductById(Long id, Product product);
     void deleteProductById(Long id);
     void deleteAllProducts();
     void deleteAllInBatch(List<Product> productList);
}
