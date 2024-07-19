/**
 * 
 */
package OOP;

/**
 * 
 */
class Visa implements Payment {
    private String cardNumber;

    public Visa(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " USD using Visa card.");
    }
}
