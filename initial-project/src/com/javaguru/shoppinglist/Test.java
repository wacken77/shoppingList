package com.javaguru.shoppinglist;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Product testProduct = new Product();
        testProduct.setPrice(BigDecimal.valueOf(100));
        testProduct.setDiscount(15);
        testProduct.setDescription("Co");
        System.out.println(testProduct.toString());
    }

}
