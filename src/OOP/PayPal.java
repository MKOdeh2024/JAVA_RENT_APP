/**
 * 
 */
package OOP;

/**
 * 
 */
class PayPal implements Payment {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " USD using PayPal.");
    }
}
