package com.learning.controller;

import com.learning.entity.Product;
import com.learning.s2s.client.CarServiceClient;
import com.learning.s2s.shared.Car;
import com.learning.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    CarServiceClient carServiceClient;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
       return productService.getProductById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PostMapping("/add-all")
    public void addAllProducts(@RequestBody List<Product> productList) {
        productService.addAllProducts(productList);
    }

    @PutMapping("/{id}")
    public void updateProductById(@PathVariable Long id, @RequestBody Product product) {
         productService.updateProductById(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {productService.deleteProductById(id); }

    @DeleteMapping("/delete-all")
    public void deleteAllProducts() { productService.deleteAllProducts(); }

    @DeleteMapping("/delete-in-batch")
    public void deleteAllInBatch(@RequestBody List<Product> productList) { productService.deleteAllInBatch(productList);}

    @GetMapping("/cars")
    public List<Car> getAllCars(){
        return carServiceClient.findAllCars();
    }
}
