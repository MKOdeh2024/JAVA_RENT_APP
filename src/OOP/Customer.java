package OOP;

import java.util.ArrayList;
import java.util.List;

public class Customer  extends Person {
	private List<Contract> contracts;
    private double balance;

    public Customer(String name, double initialBalance) {
        super(name);
        this.contracts = new ArrayList<>();
        this.balance = initialBalance;
    }


	public void rent(Owner owner, Building building, int rentalPeriod, double price) {
        if (balance < price) {
            throw new IllegalStateException("Insufficient funds to rent the building");
        }

        Contract contract = Contract.generateContract(this, owner, building, rentalPeriod, price);
        contracts.add(contract);
        balance -= price;
        System.out.println("Rent paid. Remaining balance: " + balance + " USD");
    }

    public void displayContracts() {
        for (Contract contract : contracts) {
            contract.displayContract();
        }
    }
}
