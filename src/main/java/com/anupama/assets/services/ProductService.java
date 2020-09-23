package com.anupama.assets.services;

import java.util.List;
import java.util.Optional;

import com.anupama.assets.models.Product;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product addProduct(Product product);
    public Optional<Product> getProductById(Long id);
}
