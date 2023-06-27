interface One {
	final int variable = 1;
}

public class Interfaces implements One {
	public static void main(String[] args) {
		One n = new Interfaces();
		
		System.out.println(n.variable);
	}
}