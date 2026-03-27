package com.example.ecommerce.repository; // உன் பேக்கேஜ் பெயரைச் சரிபார்

import com.example.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

