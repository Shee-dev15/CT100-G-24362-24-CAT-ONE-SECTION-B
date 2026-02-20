/*
 * Registration number: CT100/G/24362/24
 * NAME: KARUBIU MILELE WANJIRU
 * Program: Showroom.java
 * Purpose: Demonstrates inheritance by using a Vehicle base class and a Car subclass.
 */

import java.util.Scanner;

// i) Base class: Vehicle (8 Marks)
class Vehicle {
    // Fields to store vehicle details
    String brand;
    String model;
    int year;

    // Constructor to initialize the fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to print the vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// ii) Subclass: Car that inherits from Vehicle (5 Marks)
class Car extends Vehicle {
    // Additional field specific to Car
    String fuelType;

    // Constructor initializing both Vehicle fields and Car fields
    public Car(String brand, String model, int year, String fuelType) {
        // 'super' calls the constructor of the parent class (Vehicle)
        super(brand, model, year); 
        this.fuelType = fuelType;
    }

    // Overriding the displayDetails method to include fuelType
    @Override
    public void displayDetails() {
        // Call the parent class's displayDetails method first
        super.displayDetails(); 
        // Then print the new fuelType field
        System.out.println("Fuel Type: " + fuelType);
    }
}

// iii) Main class: Showroom
public class Showroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Enter Car Information ---");
        
        // Prompting for user input
        System.out.print("Enter brand: ");
        String brand = input.nextLine();

        System.out.print("Enter model: ");
        String model = input.nextLine();

        System.out.print("Enter year: ");
        int year = input.nextInt();
        
        // Clear the leftover "Enter" key from nextInt()
        input.nextLine(); 

        System.out.print("Enter fuel type (e.g., Petrol, Diesel, Electric): ");
        String fuelType = input.nextLine();

        // Instantiate the Car object using the user-provided data
        Car myCar = new Car(brand, model, year, fuelType);

        System.out.println("\n--- Car Details Summary ---");
        // Call the overridden method to display all details
        myCar.displayDetails();

        input.close();
    }
}
