public class GooglePayPayment implements PaymentMethod {
	private String authToken;
	
	public GooglePayPayment(String authToken) {
		this.authToken = authToken;
	}
	
	@Override
	public void processPayment(double amt) {
		//Logic to process credit card payment
		System.out.println("Processing Google Pay payment of $" + amt);
	}
}