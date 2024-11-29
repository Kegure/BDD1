package com.bd1.SearchU.Repository;

import com.bd1.SearchU.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
        @Query("SELECT p FROM Product p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :query, '%')) " +
                "OR LOWER(p.description) LIKE LOWER(CONCAT('%', :query, '%'))")
        List<Product> searchProducts(@Param("query") String query);

        List<Product> findByCategoryIgnoreCase(String category);
        List<Product> findByNameContainingIgnoreCase(String name);
}
