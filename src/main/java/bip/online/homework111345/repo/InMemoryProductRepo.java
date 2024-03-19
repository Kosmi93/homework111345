package bip.online.homework111345.repo;

import bip.online.homework111345.entity.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@Scope("session")
public class InMemoryProductRepo implements IProductRepo {
    private final List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return Collections.unmodifiableList(this.products);
    }

    @Override
    public Product save(Product data) {
        products.add(data);
        return data;
    }


}
