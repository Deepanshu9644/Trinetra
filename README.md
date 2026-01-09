# Trinetra Backend

**Trinetra** is a Spring Boot-based backend application for managing employee centers. It provides RESTful APIs for performing CRUD operations on center records, including name-based and ID-based deletions.

## 📌 Features

- Add new centers (name, address, company name, status)
- View all centers
- Delete a center by ID
- Delete a center by name

## ⚙️ Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL (or any compatible DB)
- Maven


---

## 📁 Project Structure

com.trinetra
├── controllers
│ └── CenterControllar.java
├── dao
│ └── CenterRepository.java
├── entity
│ └── Center.java
├── service
│ └── CenterService.java
