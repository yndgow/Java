package ch06;

public class Taxi {
	String taxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.print("택시 " + taxiNumber + "번의 승객은 ");
		System.out.print(passengerCount + "명이고, 수입은 ");
		System.out.print(money + "원 입니다.");
	}
}
