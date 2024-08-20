# Pharma-Supply-Chain-System
Hackathon Project

## Project Overview
The "Pharma Supply Chain System using Smart Contracts" project aims to create a secure, transparent, and efficient system for managing the pharmaceutical supply chain. This system leverages smart contracts to address key challenges such as counterfeiting, diversion, theft, and inefficiencies in traditional paper-based systems. By implementing this project, we aim to enhance the integrity and transparency of the pharmaceutical supply chain, reduce costs, and improve patient safety.

## Goals of the Project
Transparency and Immutability: Create a transparent and immutable record of every transaction in the supply chain.
Fraud Prevention: Prevent fraud, counterfeiting, and other illegal activities.
Efficiency Improvement: Reduce time and resources needed to manage the supply chain.
Cost Reduction: Improve efficiency and reduce costs.
Enhanced Security: Prevent hacking, data breaches, and other security threats.

## Project Structure
The project is divided into several modules, each representing different participants in the supply chain:

1.Manufacturer Module: Allows manufacturers to register drug details.
2.Distributor Module: Allows distributors to verify shipments.
3.Logistics Module: Enables logistics personnel to update the location of shipments.
4.Pharmacy Module: Allows pharmacies to verify drug authenticity.
5.Patient Module: Enables patients to verify drug authenticity using QR codes.
6.Audit Module: Provides access to audit logs for tracking and verification.

## Installation

### Prerequisites
1.Java Development Kit (JDK): Ensure that JDK 8 or later is installed on your machine.
2.Integrated Development Environment (IDE): Use an IDE like IntelliJ IDEA or Eclipse for Java development.

### Steps to Install
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/pharma-supply-chain-system.git
   cd pharma-supply-chain-system

1. **Compile the Code:**
   ```bash
   javac -d bin src/*.java

1. **Run the Application:**
   ```bash
   java -cp bin PharmaSupplyChainSystem

## Usage

### Main Application
1.Launch the Application: Run the PharmaSupplyChainSystem class to start the application.
2.Modules:
-Manufacturer Module: Add drug details.
-Distributor Module: Verify shipments.
-Logistics Module: Update shipment locations.
-Pharmacy Module: Verify drug authenticity.
-Patient Module: Verify drug authenticity using QR codes.
-Audit Module: View audit logs.

## Code Structure
1. PharmaSupplyChainSystem.java
  Description: Main class that initializes the application and provides 
  navigation to different modules.
  Location: src/PharmaSupplyChainSystem.java
2. ManufacturerModule.java
  Description: Module for manufacturers to register drug details.
  Location: src/ManufacturerModule.java
3. DistributorModule.java
  Description: Module for distributors to verify shipments.
  Location: src/DistributorModule.java
4. LogisticsModule.java
  Description: Module for logistics personnel to update shipment locations.
  Location: src/LogisticsModule.java
5. PharmacyModule.java
  Description: Module for pharmacies to verify drug authenticity.
  Location: src/PharmacyModule.java
6. PatientModule.java
  Description: Module for patients to verify drug authenticity using QR        codes.
  Location: src/PatientModule.java
7. AuditModule.java
  Description: Module to access and view audit logs.
  Location: src/AuditModule.java

## Features
GUI Interface: User-friendly graphical interface for each module.
Simulation: Demonstrates core functionalities with simulated logic.
Modular Design: Each module handles specific aspects of the supply chain.
Audit Logs: Track and view audit logs for transparency.

## Security Concerns
Data Integrity: Ensures that the data recorded in the system is accurate and unaltered.
Access Control: Different modules have specific access controls to prevent unauthorized actions.
Simulated Blockchain Integration: Placeholder logic simulates blockchain interactions for educational purposes.

## Future Enhancements
Blockchain Integration: Replace simulated logic with real blockchain interactions using a Java blockchain SDK.
Advanced Security Features: Implement encryption, authentication, and secure access controls.
Additional Modules: Introduce new modules for regulatory oversight, alerts for supply chain disruptions, and customer feedback.

## Contributing
If you would like to contribute to the project, please follow these steps:

Fork the Repository.
Create a New Branch for your feature or bug fix.
Commit Your Changes and push to your forked repository.
Create a Pull Request from your branch to the main repository.
