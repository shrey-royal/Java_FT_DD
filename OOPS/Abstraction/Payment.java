public class Payment {
	public static void main(String[] args) {
		PaymentMethod creditCardPayment = new CreditCardPayment("1234 5678 9012 3456", "123");
		creditCardPayment.processPayment(100.0);
		
		PaymentMethod payPalPayment = new PayPalPayment("example@gmail.com", "password");
		payPalPayment.processPayment(200.0);
		
		PaymentMethod googlePayPayment = new GooglePayPayment("auth_Token");
		googlePayPayment.processPayment(300.0);
		
		
	}
}