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


    public List<Product> listProducts() {
        return ProductRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return ProductRepository.save(product);
    }

    public Product getProductById(Long id) {
        return ProductRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        return ProductRepository.findAll();
    }
    public List<Product> searchByName(String name) {
        return ProductRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Product> filterByCategory(String category) {
        return ProductRepository.findByCategoryIgnoreCase(category);
    }
    public void deleteProduct(Long id) {
        ProductRepository.deleteById(id);
    }



    public List<Product> searchProducts(String query) {
            return ProductRepository.searchProducts(query);
    }

}
