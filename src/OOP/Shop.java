
package OOP;

// shop class
public class Shop extends Building {
	public Shop(String name, String address, double size, boolean isAvailable,Owner owner) {
        super(name, address, size, isAvailable, owner);
    }

    @Override
    public void displayDetails() {
        System.out.println("Shop Name: " + name + ", Address: " + address + ", Size: " + size + ", Availabilty: " + isAvailable());
    }
}
