package com.geekbrains.spring.mvc.services;

import com.geekbrains.spring.mvc.model.Product;
import com.geekbrains.spring.mvc.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Component
public class ProductService {
    private ProductRepository products;

    @Autowired
    public void setProducts(ProductRepository products) {
        this.products = products;
    }

    public List<Product> getAllProduct() {
        return products.getAllProducts();
    }

    public Product getProductByID(int id) throws ResourceRuntimeException {
        for (Product p : products.getAllProducts()) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new ResourceRuntimeException("product not found");
    }


    public void addProduct(Product product) {
        products.addProduct(product);
    }

    public void deleteProduct(int id){
        products.deleteProduct(id);
    }
}
