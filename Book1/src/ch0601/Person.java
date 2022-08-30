package ch0601;

public class Person {
	
	private int money;
	
	public Person(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void drink(int money) {
		this.money -= money;
	}
}
