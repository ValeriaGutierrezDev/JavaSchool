package com.globant.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem{

    Product product; //this product has its price and the category
    private Double priceItem; //price after apply discount by category
    private Integer quantity;
    private Double tax; //calculated over priceItem

    public Double applyDiscountByCategory(double price, double discount){
        return priceItem;
    }

    public Double getTaxes(Double priceItem) {
        return tax;
    }
}
