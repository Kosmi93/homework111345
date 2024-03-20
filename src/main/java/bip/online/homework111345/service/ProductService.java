package bip.online.homework111345.service;

import bip.online.homework111345.entity.Product;
import bip.online.homework111345.repo.IProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {
    private final IProductRepo repo;

    public List<Product> findAll() {
        return this.repo.findAll();
    }

    @Override
    public void add(String ids) {
        List<Long> listIs = Arrays.stream(ids.split(","))
                .map(Long::parseLong).toList();
        listIs.forEach(i -> repo.save(new Product(i, "Товар №%d".formatted(i), "Описание товара №%d".formatted(i))));
    }
}
