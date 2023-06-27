class Parent{
	protected double money;
	
	public Parent(double money){
		this.money = money;
	}
	
	public double getMoney(){
		return money;
	}
	
	public void setMoney(double money){
		this.money = money;
	}
}

class Child extends Parent {
	
	public double money;
	
	public Child(double money){
		super(money);	//super kw used as constructor
		this.money = 7000;
	}
	
	public void Dad_Money(double want_money){
		super.money -= want_money;
		this.money += want_money;
	}
}


class Super_kw{
	public static void main(String[] args) {
		Child c = new Child(0);
	
		c.setMoney(100000);
		System.out.println("Money from parents class: " + c.getMoney());
		System.out.println("Child ->" + c.money);
		
		c.Dad_Money(10000);
		
		System.out.println("Parent_Money: " + c.getMoney() + "\nChild_money: " + c.money);
		
		
	}
}