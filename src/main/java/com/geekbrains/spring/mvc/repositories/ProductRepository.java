package com.geekbrains.spring.mvc.repositories;

import com.geekbrains.spring.mvc.model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1, "bread", 56));
        products.add(new Product(2, "cheese", 560));
        products.add(new Product(3, "milk", 96));
        products.add(new Product(4, "meet", 256));
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(products);
    }

    public void addProduct(Product product) {
        products.add(product);

    }
    public void deleteProduct(int id){
        products.removeIf(p -> p.getId() == id);
    }
}
