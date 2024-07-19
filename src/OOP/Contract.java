package OOP;

public class Contract {
    private Customer customer;
    private Building building;
    private int rentalPeriod;
    private double price;

    public Contract(Customer customer, Building building, int rentalPeriod, double price) {
    	
    	if (!building.isAvailable()) {
            throw new IllegalArgumentException("Building is not available for rent");
        }
    	
        this.customer = customer;
        this.building = building;
        this.rentalPeriod = rentalPeriod;
        this.price = price;
        building.setAvailability(false);
    }

    public void displayContract() {
        System.out.println("Contract Details: ");
        System.out.println("Customer Name: " + customer.getName());
        building.displayDetails();
        System.out.println("Rental Period: " + rentalPeriod + " months");
        System.out.println("Price: " + price + " USD");
    }
}