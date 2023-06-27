public class PayPalPayment implements PaymentMethod {
	private String email;
	private String password;
	
	public PayPalPayment(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	@Override
	public void processPayment(double amt) {
		//Logic to process credit card payment
		System.out.println("Processing PayPal payment of $" + amt);
	}
}