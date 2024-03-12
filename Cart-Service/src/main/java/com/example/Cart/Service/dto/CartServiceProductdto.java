package com.example.Cart.Service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartServiceProductdto {
    private Long id;
    private String title;
    private String description;
    private String category;
    private String image;
    private double price;
}
