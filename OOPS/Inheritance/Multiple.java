class Father {
/*
	public void msg() {
		System.out.println("father class");
	}
*/
}

class Mother {
	public void msg() {
		System.out.println("mother class");
	}
}

class Child extends Father, Mother {
	public void child () {
		super.msg();
		super.msg();
	}
}

class Multiple {
	public static void main(String[] args) {
		Child c = new Child();
		
		c.child();
	}
}

/*
Java doesn;t support multiple inheritance

Due to the error of ambiguity

*/