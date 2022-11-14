package com.globant.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long idProduct;
    private String name;
    private String description;
    private String brand;
    private String measurementUnit;
    private Double price;
    private Integer stock;
    private Integer likes;
    Category category;

    public Product getInfoProduct(){
        return null;
    }
}
