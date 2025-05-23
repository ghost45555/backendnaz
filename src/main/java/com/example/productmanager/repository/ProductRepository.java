package com.example.productmanager.repository;

import com.example.productmanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByIsNewArrivalTrue();
    List<Product> findByIsBestSellerTrue();
    List<Product> findByIsFeaturedTrue();
} 