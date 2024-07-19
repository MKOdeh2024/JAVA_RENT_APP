package OOP;

import java.util.ArrayList;
import java.util.List;

public class Customer {
     String name;
     List<Contract> contracts;

    public Customer(String name) {
        this.name = name;
        this.contracts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public void displayContracts() {
        for(Contract contract : contracts) {
            contract.displayContract();
        }
    }
}