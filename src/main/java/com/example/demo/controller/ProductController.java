package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class ProductController {

    @Autowired
    ProductService ps;

    @GetMapping("/all")
    Map<String, Product> getAll() {
        return ps.getMapOfProducts();
    }

    @GetMapping("/getOne")
    Product getById(@RequestParam String id) {
        return ps.getProductById(id);
    }
}
