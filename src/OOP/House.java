
package OOP;

// House class
public class House extends Building {
	public House(String name, String address, double size, boolean isAvailable, Owner owner) {
        super(name, address, size, isAvailable, owner);
    }

    @Override
    public void displayDetails() {
        System.out.println("House Name: " + name + ", Address: " + address + ", Size: " + size + ", Availabilty: " + isAvailable());
    }
}
