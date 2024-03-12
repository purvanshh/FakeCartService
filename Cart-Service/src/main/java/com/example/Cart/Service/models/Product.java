package com.example.Cart.Service.models;
import com.example.Cart.Service.models.Product;
import java.util.Locale.Category;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class Product {
    private Long id;
    private String title;
    private String description;
    private double price;
    private Category category;
    private String imageUrl;
    public void setCategory(com.example.Cart.Service.models.Category category2) {
        throw new UnsupportedOperationException("Unimplemented method 'setCategory'");
    }
    public Product getSingleProduct(Long id2) {
        throw new UnsupportedOperationException("Unimplemented method 'getSingleProduct'");
    }
}
