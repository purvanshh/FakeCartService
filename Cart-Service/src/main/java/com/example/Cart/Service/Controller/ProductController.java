package com.example.Cart.Service.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.Cart.Service.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    private Product productService;

    public ProductController(Product productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return null;
    }

    @GetMapping("/products/{id}")
        public Product getSingleProduct(@PathVariable("id") Long id) {
            return productService.getSingleProduct(id);
        }
}