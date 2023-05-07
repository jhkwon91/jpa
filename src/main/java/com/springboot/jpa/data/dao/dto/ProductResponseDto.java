package com.springboot.jpa.data.dao.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private long number;
    private String name;
    private int price;
    private int stock;

    public ProductResponseDto() {
    }

    public ProductResponseDto(long number, String name, int price, int stock) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
