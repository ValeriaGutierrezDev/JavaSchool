package com.globant.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {

    Client client;
    List<CartItem> items; //this item has its discounted price and its quantity
    private Double totalDiscounts;
    private Double totalPriceCart;
    private Double totalTaxesCart;

    public Double getFinalPrice(){
        return totalPriceCart;
    }

}
