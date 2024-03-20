package bip.online.homework111345.controller;

import bip.online.homework111345.entity.Product;
import bip.online.homework111345.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping("/get")
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping("/add")
    public void add(String ids) {
        service.add(ids);
    }
}
