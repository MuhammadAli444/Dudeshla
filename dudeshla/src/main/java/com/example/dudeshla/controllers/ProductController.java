package com.example.dudeshla.controllers;

import com.example.dudeshla.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/test")
    public String test() {
        return "test";
    }


    @GetMapping("/")
    public String products(Model model) {
        model.addAttribute("test", productService.listProducts());
        return "test";

    }
}
