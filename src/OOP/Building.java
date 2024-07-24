package OOP;

//Abstract class for Building
abstract class Building {
    protected String name;
    protected String address;
    protected double size;
    private boolean isAvailable;
    private Owner owner;
    
    public Building(String name, String address, double size, boolean isAvailable , Owner owner) {
        this.name = name;
        this.address = address;
        this.size = size;
        this.isAvailable = isAvailable;
        this.owner = owner;
    }
    
    
    
    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}



	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}



	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}



	public boolean isAvailable () {
    	return isAvailable;
    }
    
    public void setAvailability(boolean available) {
    	isAvailable = available;
    }
    public abstract void displayDetails();
}


	
	
	

