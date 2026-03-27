package com.example.ecommerce.service;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.OrderRepository;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    public Order placeOrder(Order order) {

        // 1. Get the full product details from dsatabase
        Product product = productRepository.findById(order.getProduct().getId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // 2. check the details have stock
        if (product.getStockQuantity() < order.getQuantity()) {
            throw new RuntimeException("Sorry! Product is out of stock.");
        }

        // 3. Reduce the stock
        product.setStockQuantity(product.getStockQuantity() - order.getQuantity());
        productRepository.save(product); // update the resuduce stock

        // 4. Set the order details
        order.setProduct(product); // Set product details to avoid null values in the response
        order.setTotalPrice(product.getPrice() * order.getQuantity());
        order.setOrderDate(LocalDateTime.now());

        // 5. Save the order
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}