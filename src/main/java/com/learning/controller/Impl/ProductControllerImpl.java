package com.learning.controller.Impl;

import com.learning.controller.ProductController;
import com.learning.entity.Product;
import com.learning.s2s.client.CarServiceClient;
import com.learning.s2s.shared.Car;
import com.learning.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllerImpl implements ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    CarServiceClient carServiceClient;
    @Override
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @Override
    public Product getProductById(Long id) {
       return productService.getProductById(id);
    }

    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @Override
    public void addAllProducts(List<Product> productList) {
        productService.addAllProducts(productList);
    }

    @Override
    public void updateProductById(Long id, Product product) {
         productService.updateProductById(id, product);
    }

    @Override
    public void deleteProductById(Long id) {productService.deleteProductById(id); }

    @Override
    public void deleteAllProducts() { productService.deleteAllProducts(); }

    @Override
    public void deleteAllInBatch(List<Product> productList) { productService.deleteAllInBatch(productList);}

    @GetMapping("/cars")
    public List<Car> getAllCars(){
        return carServiceClient.getAllCars();
    }

}
