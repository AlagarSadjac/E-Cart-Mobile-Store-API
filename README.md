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

-   Screen Shots
- 
<img width="1256" height="711" alt="Screenshot 2026-03-27 095003" src="https://github.com/user-attachments/assets/6b56458f-837d-47b9-9071-ed00c1e844d1" />

<img width="1920" height="1008" alt="Screenshot 2026-03-27 095107" src="https://github.com/user-attachments/assets/ac05803d-df56-49b0-b319-3b1574bc6f8f" />

<img width="1256" height="735" alt="Screenshot 2026-03-27 095420" src="https://github.com/user-attachments/assets/1f3ff883-633d-4403-b3c7-42973d7d2489" />

<img width="1256" height="740" alt="Screenshot 2026-03-27 095629" src="https://github.com/user-attachments/assets/75d5ce11-2080-46cb-8301-12ea3af52a23" />

<img width="1280" height="749" alt="Screenshot 2026-03-27 095740" src="https://github.com/user-attachments/assets/ed5afd3a-3cfa-440d-8fbb-286cb3268d63" />

<img width="1920" height="1008" alt="Screenshot 2026-03-27 095821" src="https://github.com/user-attachments/assets/c35517b5-5ecf-4d18-a47f-0cc5e2b08189" />


## 📝 API Endpoints
- `POST /api/users/register` - Create a new user.
- `POST /api/products` - Add a new mobile product.
- `POST /api/orders/place` - Place a new order and update stock.
