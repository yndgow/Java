package ch06;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.print("버스 " + busNumber + "번의 승객은 ");
		System.out.print(passengerCount + "명이고, 수입은 ");
		System.out.println(money + "원 입니다.");
	}
}
