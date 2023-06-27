class Address {
	int house_no;
	String building_name;
	String city, state;
	
	public Address(int house_no, String building_name, String city, String state) {
		this.house_no = house_no;
		this.building_name = building_name;
		this.city = city;
		this.state = state;
	}
}

class Employee {
	private int emp_id;	//number
	private String emp_name;	//name
	private double salary;	//number
	private Address add;	//object
	
	public Employee(int emp_id, String emp_name, double salary, Address add) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.add = add;
	}
	
	void display() {
		System.out.print("\nemp_id: " + emp_id + "\nemp_name: " + emp_name);
		System.out.print("\nsalary: " + salary + " million dollars\nHouse No.: " + add.house_no);
		System.out.print("\nBuilding_name: " + add.building_name + "\ncity: " + add.city);
		System.out.println("\nState: " + add.state);
	}
}


class Aggregation {
	public static void main(String[] args) {
		Address add = new Address(8, "Starlight Astra", "Pune", "Maharashtra");
		
		Employee e = new Employee(101, "Dixit", 100, add);
		
		e.display();
	}
}