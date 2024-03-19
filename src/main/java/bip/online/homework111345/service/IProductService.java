package bip.online.homework111345.service;

import bip.online.homework111345.entity.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void add(String ids);

}
