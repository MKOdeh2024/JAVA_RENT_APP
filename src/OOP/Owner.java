package OOP;

import java.util.ArrayList;
import java.util.List;

public class Owner  extends Person {

		// TODO Auto-generated constructor stub
		private List<Building> Buildings;

	    public Owner(String name) {
	        super(name);
	        this.Buildings = new ArrayList<>();
	    }
 

		public void addBuildings(Building build) {
	    	
	    	Buildings.add(build);
	    }

	    public void displayProperties() {
	       System.out.println("Owner name :" + name);
	       for(Building build : Buildings) {
	           System.out.println(build);
	        }
	    }

	}

