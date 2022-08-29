package ch06;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.print("지하철 " + lineNumber + "의 승객은 ");
		System.out.print(passengerCount + "명이고, 수입은 ");
		System.out.println(money + "원 입니다.");
	}
}
