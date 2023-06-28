import personpackage.Person;

public class TestPersonInPackage {
	public static void main (String[] args) {
		//Instantiate the Person Class
		Person person = new Person();
		
		//set the first name and last name properties
		person.setFirstName("Dhruv");
		person.setLastName("Panwala");
		
		//get the firstname and lastname properties for output
		System.out.println("Java bean data: " + person.getFirstName() + " " + person.getLastName());
	}
}