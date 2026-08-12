# Problem Statement

## 1. Title
Gift Card & Voucher Management System

## 2. Domain
E-Commerce / Digital Commerce

## 3. Who is the user?
1. Admin – Manages gift cards, vouchers, users and transactions.
2. Customer – Browses gift cards, redeems vouchers and tracks transactions.

## 4. What problem are we solving?
Customers often receive multiple gift cards and discount vouchers from different brands, making them difficult to track and manage. Users may forget voucher expiry dates or have difficulty finding suitable gift cards. Admins also need a centralized system to manage gift cards, vouchers, customers and redemption transactions.

## 5. Proposed Solution
The proposed system is a mobile application that provides a centralized platform for managing digital gift cards and vouchers. Customers can browse gift cards with images, view their details, redeem valid vouchers and track their transactions. Admins can manage gift cards, vouchers, customers and redemption activities.

## 6. Core Entities / Database Tables
1. User
2. GiftCard
3. Voucher
4. Transaction
5. Redemption
6. Category
7. Notification

## 7. User Roles & Permissions
Admin:
- Add, update and manage gift cards
- Create and manage vouchers
- Manage customers
- View transactions and redemptions

Customer:
- View available gift cards
- View gift card details
- Redeem vouchers
- View transaction history
- Manage profile

## 8. Success Criteria
1. A customer should be able to view available gift cards easily.
2. A customer should be able to redeem a valid voucher successfully.
3. The system should automatically reject expired or invalid vouchers.
4. The system should prevent vouchers from exceeding their usage limit.
5. A customer should be able to view their transaction history.
6. An admin should be able to monitor gift card and voucher activities.

## 9. Out of Scope
1. Real-money payment gateway
2. Physical gift card delivery
3. Real-time banking integration
4. Complex payment processing
5. Real-time customer support

## 10. Chosen Track
Java (Spring Boot)