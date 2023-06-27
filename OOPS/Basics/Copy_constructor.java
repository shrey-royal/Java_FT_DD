class Joke {
	private String joke;
	
	public Joke(String joke) {
		this.joke = joke;	//initialization
	}
	
	public Joke(Joke original) {	//copy constructor
		this.joke = original.joke + " But wait, there's more! " + original.joke;
	}
	
	public void tellJoke() {
		System.out.println(joke);
	}	
}

public class Copy_constructor {
	public static void main(String[] args) {
		Joke original = new Joke("Dixit and Dhruv passed OCP(Oracle Certified Professional)");
		original.tellJoke();
		
		Joke copy = new Joke(original);
		copy.tellJoke();
	}
}

/* Car: model, name, mileage
	Methods: printCarDetails
*/