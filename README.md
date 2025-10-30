# 🚗 Vehicle Manufacturing & Service Management System  
**(Hybrid Dependency Injection — Spring XML + Annotation + @ComponentScan)**  

## 🎯 Project Objective  
This project demonstrates the concept of **Hybrid Dependency Injection** in the Spring Framework — combining **XML-based configuration** and **Annotation-based wiring** (`@Autowired`, `@ComponentScan`).  

It simulates a simple **Vehicle Manufacturing & Service Management System**, where vehicles, engines, and tyres are integrated and serviced at a service center.

---

## 🧩 Class-wise Design  

### 1️⃣ Engine.java  
**Injection Type:** Constructor Injection via XML  
- Fields: `engineType`, `horsePower`  
- Method: `showEngineDetails()`  
- Purpose: Represents the engine details of a vehicle.

### 2️⃣ Tyre.java  
**Injection Type:** Setter Injection using Annotation (`@Component`)  
- Fields: `brand`, `size`  
- Method: `showTyreDetails()`  
- Purpose: Represents the tyre details for a vehicle.

### 3️⃣ Vehicle.java  
**Injection Type:** Hybrid (Constructor for Engine, Setter for Tyre)  
- Fields: `vehicleName`, `engine`, `tyre`  
- Method: `displayVehicleInfo()`  
- Purpose: Combines engine and tyre information for a specific vehicle.

### 4️⃣ ServiceCenter.java  
**Injection Type:** Setter Injection  
- Fields: `vehicle`, `serviceType`  
- Method: `performService()`  
- Purpose: Represents a service center that performs maintenance or checks on a vehicle.

### 5️⃣ MainApp.java  
- Loads the Spring context (`config.xml`)  
- Fetches `ServiceCenter` bean  
- Calls `performService()` to display all details.

---

## ⚙️ Technologies Used  
- **Java 17+**  
- **Spring Framework (Core)**  
- **Eclipse / IntelliJ IDEA / Spring Tool Suite (STS)**  
- **XML Configuration + Annotations**  

---

## 🧠 Key Spring Concepts Demonstrated  
- **Constructor Injection** using `<constructor-arg>`  
- **Setter Injection** using `<property>`  
- **Annotation-based Injection** using `@Autowired`  
- **Component Scanning** using `@Component` and `<context:component-scan>`  
- **Hybrid Dependency Injection** (XML + Annotations)

  ---
  ## 🏗️ Project Folder Structure

  VehicleManufacturingSystem/

│
├── src/main/java/

│ ├── com/vehiclemanagement/beans/

│ │ ├── Engine.java

│ │ ├── Tyre.java

│ │ ├── Vehicle.java

│ │ └── ServiceCenter.java

│ │
│ └── com/vehiclemanagement/main/

│ └── MainApp.java


│
├── src/main/resources/

│ └── config.xml

│
├── pom.xml

└── README.md

---
## Sample Output

=== Vehicle Manufacturing & Service System ===

Vehicle Name: Toyota Fortuner

Engine Details: Type = V8 Turbo, HorsePower = 400

Tyre Details: Brand = MRF, Size = 18

Service Type: Full Engine Checkup


---

## 🧠 Learning Outcome

This project provides hands-on experience in:

Implementing Dependency Injection in multiple ways

Understanding Spring IoC Container behavior

Combining XML and Annotation configurations effectively

Structuring maintainable, modular Spring applications


