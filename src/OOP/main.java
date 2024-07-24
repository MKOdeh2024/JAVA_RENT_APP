package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class main {
    private static List<Building> buildings = new ArrayList<>();
    private static List<Owner> owners = new ArrayList<>();

    public static void main(String[] args) {
        // Initialize buildings and owners
    	
    	 Owner owner1 = new Owner("Jane Smith");
         Owner owner2 = new Owner("Bob Johnson");
         Owner owner3 = new Owner("Alice Brown");
         
         owners.add(owner1);
         owners.add(owner2);
         owners.add(owner3);
    	
    	// Initialize buildings
        buildings.add(new Apartment("Skyline Apartments", "100 High St", 1000.0, true, owner1));
        buildings.add(new House("Maple Grove Cottage", "200 Maple Ave", 1500.0, true, owner1));
        buildings.add(new Shop("Downtown Boutique", "300 Main St", 800.0, true, owner1));
        buildings.add(new Apartment("Riverside Lofts", "150 River Rd", 1200.0, true, owner1));

        buildings.add(new House("Oakwood Manor", "250 Oak St", 2000.0, true, owner2));
        buildings.add(new Shop("Tech Hub Store", "350 Innovation Ave", 1000.0, true, owner2));
        buildings.add(new Apartment("City Center Suites", "400 Center St", 1100.0, true, owner2));

        buildings.add(new House("Sunflower Cottage", "500 Garden Rd", 1800.0, true, owner3));
        buildings.add(new Shop("Artisan's Corner", "600 Craft St", 750.0, true, owner3));
        buildings.add(new Apartment("Harbor View Residences", "700 Dock Rd", 1300.0, true, owner3));
        
        
       

       

        

        // Initialize customer with initial balance
        Customer customer = new  Customer("John Doe", 5000.0);

        // Demonstrate rental process
        try {
        	customer.rent(owner1, searchBuildingByName("Downtown Boutique"), 12, 1200.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            customer.rent(owner2, searchBuildingByName("Sunset Villa"), 6, 1500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            customer.rent(owner3, searchBuildingByName("Downtown Shop"), 24, 800.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Display all contracts
        System.out.println("\nAll contracts for " + customer.getName() + ":");
        customer.displayContracts();

        // Note: Payment is now handled within the rent() method, so we don't need separate payment calls here
    }

    private static Building searchBuildingByName(String name) {
        for (Building building : buildings) {
            if (building.getName().equals(name)) {
                return building;
            }
        }
        throw new IllegalArgumentException("Building not found: " + name);
    }
}
