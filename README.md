# 🛒 E-Cart Mobile Store API

A professional E-commerce Backend application developed using **Java** and **Spring Boot**. This project manages users, products, and order placements with automated business logic.

## 🚀 Features
- **User Management:** Register and fetch user details.
- **Product Catalog:** Manage mobile phone inventory (Name, Description, Price, Stock).
- **Order Placement:** Users can place orders for specific products.
- **Smart Stock Management:** Automatically reduces product stock quantity when an order is placed.
- **Automated Calculations:** Calculates `totalPrice` based on product price and quantity.

## 🛠️ Tech Stack
- **Language:** Java 17+
- **Framework:** Spring Boot 3.x
- **Database:** MySQL
- **ORM:** Spring Data JPA (Hibernate)
- **API Testing:** Postman

- Screen Shots

- <img width="1920" height="1008" alt="Screenshot 2026-03-27 095821" src="https://github.com/user-attachments/assets/8526a03e-709d-490c-bf0f-f4cad8194478" />


## 📝 API Endpoints
- `POST /api/users/register` - Create a new user.
- `POST /api/products` - Add a new mobile product.
- `POST /api/orders/place` - Place a new order and update stock.
-
