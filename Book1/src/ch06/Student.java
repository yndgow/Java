package ch06;

public class Student {
	public String studentName;
	public int grade;
	public int money; // 학생이 가진 돈 
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 버스 천원
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// 지하철 천오백원
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// 택시
	public void takeTaxi(Taxi taxi, int price) {
		taxi.take(price);
		this.money -= price;
	}
	
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원입니다.");
	}
	
}
