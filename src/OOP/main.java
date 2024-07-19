package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class main {
	 private static List<Building> buildings = new ArrayList<>();

	 public static void main(String[] args) {
		 
		 // Initialize buildings
	        buildings.add(new Apartment("City View Apartment", "123 Main St", 850.5, true));
	        buildings.add(new House("Sunset Villa", "456 Elm St", 1200.75 , false));
	        buildings.add(new Shop("Downtown Shop", "789 Market St", 400.0, true));

	        // Customer
	        Customer customer = new Customer("John Doe");

	        // Demonstrate rental process
	        try {
	            Contract contract1 = new Contract(customer, searchBuildingByName("City View Apartment"), 12, 1200.0);
	            customer.addContract(contract1);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        buildings.get(1).setAvailability(false); // Manually setting a building to unavailable for demonstration

	        try {
	            Contract contract2 = new Contract(customer, searchBuildingByName("Sunset Villa"), 6, 1500.0);
	            customer.addContract(contract2);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            Contract contract3 = new Contract(customer, searchBuildingByName("Downtown Shop"), 24, 800.0);
	            customer.addContract(contract3);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        customer.displayContracts();
	        

	        // Demonstrate payment
	        Payment payment1 = new PayPal("john.doe@example.com");
	        Payment payment2 = new Visa("1234-5678-9101-1121");
	        Payment payment3 = new MasterCard("1111-2222-3333-4444");

	        payment1.pay(1200.0);
	        payment2.pay(1500.0);
	        payment3.pay(800.0);
	    }
	 

	    // Search and filter functionalities
	    public static Building searchBuildingByName(String name) {
	        for (Building building : buildings) {
	            if (building.name.equals(name) && building.isAvailable()) {
	                return building;
	            }
	        }
	        throw new IllegalStateException("Building not found or unavailable.");
	    }

	    public static List<Building> filterBuildingsBySize(double minSize, double maxSize) {
	        return buildings.stream()
	                .filter(building -> building.size >= minSize && building.size <= maxSize && building.isAvailable())
	                .collect(Collectors.toList());
	    }

}
