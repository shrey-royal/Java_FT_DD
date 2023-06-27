/*
An Interface is a programming construct that defines a set of methods that a class must implements.

- no implementation details in methods

class		extends 	class
class 		implements	interface
interface	extends		interface
*/

public class CreditCardPayment implements PaymentMethod {
	private String cardNumber;
	private String cvv;
	
	public CreditCardPayment(String cardNumber, String cvv) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	@Override
	public void processPayment(double amt) {
		//Logic to process credit card payment
		System.out.println("Processing credit card payment of $" + amt);
	}
}