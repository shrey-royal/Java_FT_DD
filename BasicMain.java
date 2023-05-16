public class BasicMain {

	public static void main(String[] args) {
		System.out.println("You have entered following arguments at runtime:");
		for(int i=0; i < args.length; i++) {
			System.out.println(i + ": " + args[i]);
		}
	}
}