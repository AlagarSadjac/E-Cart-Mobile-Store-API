package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cs_products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
}
