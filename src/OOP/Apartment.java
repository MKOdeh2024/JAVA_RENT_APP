
package OOP;

// Specific types of buildings
public class Apartment extends Building {
    public Apartment(String name, String address, double size, boolean isAvailable, Owner owner) {
        super(name, address, size, isAvailable,owner);

  }
    
    

    
    
    @Override
    public void displayDetails() {
        System.out.println("Apartment Name: " + name + ", Address: " + address + ", Size: " + size + ", Availabilty: " + isAvailable());
    }
}
