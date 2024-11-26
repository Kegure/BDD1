package com.bd1.SearchU.Service;

import com.bd1.SearchU.Entity.Product;
import com.bd1.SearchU.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;


    public List<Product> searchProducts(String query) {
        return ProductRepository.findByNameContainingIgnoreCase(query);
    }

    public List<Product> listProducts() {
        return ProductRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return ProductRepository.save(product);
    }

    public Product getProductById(Long id) {
        return ProductRepository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        ProductRepository.deleteById(id);
    }
}
