package com.javaguru.shoppinglist.service.validation;

public class ProductValidationException extends IllegalArgumentException {
    public ProductValidationException(String message) {
        super(message);
    }
}
