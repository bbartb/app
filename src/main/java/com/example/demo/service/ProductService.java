package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    private Map<String, Product> mapOfProducts = new HashMap<String, Product>();

    public ProductService() {
        Product p1 = new Product("Glue", 3.23, "strong");
        Product p2 = new Product("Glue2", 32.23, "strong2");

        mapOfProducts.put("1", p1);
        mapOfProducts.put("2", p2);
    }

    public Map<String, Product> getMapOfProducts() {
        return mapOfProducts;
    }

    public Product getProductById(String id) {
        return mapOfProducts.get(id);
    }

}
