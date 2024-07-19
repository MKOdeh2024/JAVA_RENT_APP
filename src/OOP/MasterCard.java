/**
 * 
 */
package OOP;

/**
 * 
 */
class MasterCard implements Payment {
    private String cardNumber;

    public MasterCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " USD using MasterCard.");
    }
}
