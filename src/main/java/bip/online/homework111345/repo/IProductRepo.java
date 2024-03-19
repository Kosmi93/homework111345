package bip.online.homework111345.repo;

import bip.online.homework111345.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductRepo {
    public List<Product> findAll();

    public Product save(Product data);

}
