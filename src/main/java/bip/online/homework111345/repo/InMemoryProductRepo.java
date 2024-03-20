package bip.online.homework111345.repo;

import bip.online.homework111345.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
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
