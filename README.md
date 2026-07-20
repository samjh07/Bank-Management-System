# 🏦 Bank Management System

![Java](https://img.shields.io/badge/Java-JDK%2021-orange)
![Project](https://img.shields.io/badge/Project-Console%20Application-blue)
![Status](https://img.shields.io/badge/Status-Completed-success)
![License](https://img.shields.io/badge/License-MIT-green)

A **console-based Bank Management System** built using **Java** that simulates basic banking operations such as account creation, deposits, withdrawals, balance checking, and account management.

This project demonstrates practical implementation of **Object-Oriented Programming (OOP)** principles, **exception handling**, **file management**, and a structured Java application architecture.

---

## 📌 Project Overview

The Bank Management System allows users to manage bank accounts through an interactive menu-driven interface.

The main objective of this project is to build a simple yet realistic banking application while applying core Java concepts used in real-world software development.

---

## ✨ Features

✅ Create new bank accounts
✅ Automatically generate unique account numbers
✅ Display account details
✅ Deposit money into accounts
✅ Withdraw money with balance verification
✅ Check account balance
✅ Handle invalid operations using custom exceptions
✅ Store account data using file handling
✅ Validate user inputs
✅ Clean and modular project structure

---

## 🛠️ Tech Stack

| Technology               | Usage                           |
| ------------------------ | ------------------------------- |
| ☕ Java                   | Core programming language       |
| 🧱 OOP Concepts          | Classes, Objects, Encapsulation |
| 📚 Collections Framework | Managing account data           |
| ⚠️ Exception Handling    | Handling errors gracefully      |
| 📁 File Handling         | Data storage                    |
| 🔧 Git & GitHub          | Version control                 |

---

## 📂 Project Structure

```
Bank-Management-System
│
├── src
│
├── exception
│   ├── AccountNotFoundException.java
│   └── InsufficientBalanceException.java
│
├── main
│   ├── Main.java
│   └── Menu.java
│
├── model
│   └── Account.java
│
├── service
│   └── BankService.java
│
└── util
    ├── AccountNumberGenerator.java
    ├── ConsoleUtil.java
    ├── FileManager.java
    └── InputValidator.java
```

---

## 🚀 How To Run

### Prerequisites

Make sure you have:

* Java Development Kit (JDK 21 or above)
* Any Java IDE (VS Code / IntelliJ IDEA / Eclipse)

### Steps

**1. Clone the repository**

```bash
git clone <repository-link>
```

**2. Open the project**

Open the project folder in your preferred IDE.

**3. Run the application**

Execute:

```
src/main/Main.java
```

---

## 🎯 Concepts Implemented

### 🔹 Object-Oriented Programming

* Encapsulation
* Classes and Objects
* Constructors
* Method organization

### 🔹 Exception Handling

Custom exceptions are implemented for:

* Account not found
* Insufficient account balance

### 🔹 File Handling

Account information is stored and managed using file operations.

### 🔹 Clean Architecture

The project follows separation of responsibilities:

```
Model → Stores Data
Service → Handles Business Logic
Util → Helper Functions
Main → Application Entry Point
Exception → Error Handling
```

---

## 📸 Application Preview

<img width="301" height="311" alt="Screenshot 2026-07-20 142418" src="https://github.com/user-attachments/assets/0d01f4da-e2d4-40e6-8dbc-73935c0a8fe6" />


## 🔮 Future Enhancements

🚀 Add MySQL database integration
🚀 Implement user login authentication
🚀 Add transaction history
🚀 Create GUI using JavaFX
🚀 Add online banking features
🚀 Generate account statements

---

## 👨‍💻 Author

**Samridh Jha**

🎓 Computer Science Engineering Student

💻 Interested in Java Development, Backend Development and Software Engineering

GitHub: https://github.com/samjh07

---

## ⭐ Support

If you like this project, consider giving it a ⭐ on GitHub!

```
Learning → Building → Improving 🚀
```
