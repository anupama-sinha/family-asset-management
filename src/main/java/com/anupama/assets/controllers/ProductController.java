package com.anupama.assets.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.anupama.assets.exceptions.ResourceNotFoundException;
import com.anupama.assets.models.Product;
import com.anupama.assets.services.ProductService;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/home")
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products", produces = "application/json")
    public ResponseEntity<String> getProducts() throws JSONException {
        List<Product> products = productService.getAllProducts();
        if(products.isEmpty()){
            throw new ResourceNotFoundException("Products not Found");   
        }
        logger.info("Received Product: {}", products);
        return new ResponseEntity<>(new JSONObject().put("products",products).toString(), HttpStatus.CREATED);   
    }

    @PostMapping(value = "products", produces = "application/json")
    public ResponseEntity<Object> addProduct(@Valid @RequestBody Product product) {
        Product product_created = productService.addProduct(product);
        logger.info("Adding products: {} ", product_created);
        return new ResponseEntity<>(product_created, HttpStatus.CREATED);
    }

    @GetMapping(value = "products/{id}", produces = "application/json")
    public ResponseEntity<Object> getSpecificProduct(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        if(!product.isPresent())
            throw new ResourceNotFoundException(String.format("Product ID:%s not Found",id));
        logger.info("Received Product: {}", product);
        return ResponseEntity.ok().header("lang", "en").body(product);
    }
}