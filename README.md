# CountryFilter - Java Streams & API Integration 🌍

A console-based application developed with **Java 25** and **Spring Boot 4.0.1** that consumes the [Rest Countries API](https://restcountries.com/) to filter and search for information about countries, official names, and currencies.

The main goal of this project is to practice **Java Streams**, **Optional** handling, and complex JSON mapping using **Jackson Databind**.

## 🚀 Features
- **API Consumption:** Uses `HttpClient` to fetch real-time data.
- **Data Mapping (JSON to Java):** Implements `Records` for an immutable and clean data structure.
- **Data Processing:** Leverages the `Stream API` to filter information within collections and dynamic maps.
- **Interactive Search:** Console interface that allows users to search for countries by their official name.

## 🛠️ Technologies & Concepts
- **Java 25** (Latest features).
- **Spring Boot 4.0.1** (CommandLineRunner).
- **Jackson Framework:** Deserialization of JSON, handling `Map<String, T>` for dynamic keys (currencies).
- **Functional Programming:** Utilization of `Stream`, `filter()`, `findFirst()`, and `Optional`.
- **Clean Architecture:** Separation of concerns into `model`, `service`, and `principal` packages.

## 📦 Project Structure
- `model/`: Data Records (`CountryData`, `NameData`, `CurrencyData`).
- `service/`: Technical classes for API connection (`HttpClientService`) and data conversion (`ConvertData`).
- `principal/`: The `Principal` class that manages the menu logic and stream filters.

## ⚙️ How to Run
1. Clone the repository.
2. Ensure you have **JDK 25** installed.
3. Run the command `./mvnw spring-boot:run` or start the project from your IDE (IntelliJ IDEA recommended).

---
Developed by **JoelK** as part of the Alura Latam / Oracle Next Education (ONE) program.