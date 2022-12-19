package com.learning.controller;

import com.learning.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
public interface ProductController {

    @GetMapping
    public List<Product> getAllProducts();

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id);

    @PostMapping
    public void addProduct(@RequestBody Product product);

    @PostMapping("/add-all")
    public void addAllProducts(@RequestBody List<Product> productList);

    @PutMapping("/{id}")
    public void updateProductById(@PathVariable Long id, @RequestBody Product product);

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id);

    @DeleteMapping("/delete-all")
    public void deleteAllProducts();

    @DeleteMapping("/delete-in-batch")
    public void deleteAllInBatch(@RequestBody List<Product> productList);

}
