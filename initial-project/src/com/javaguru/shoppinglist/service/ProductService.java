package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.repository.ProductInMemoryRepository;
import com.javaguru.shoppinglist.domain.Product;
import com.javaguru.shoppinglist.service.validation.ProductValidationService;

public class ProductService {
    private ProductInMemoryRepository repository = new ProductInMemoryRepository();

    public ProductInMemoryRepository getRepository() {
        return repository;
    }

    public void setRepository(ProductInMemoryRepository repository) {
        this.repository = repository;
    }

    private ProductValidationService validationService = new ProductValidationService();

    public Long createProduct(Product product) {
        validationService.validate(product);
        Product createdProduct = repository.insert(product);
        return createdProduct.getId();
    }
}
