package ch06;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
	
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Student studentEdward = new Student("Edward", 50000);
		Taxi taxi2692 = new Taxi("2692");
		studentEdward.takeTaxi(taxi2692, 15000);
		studentEdward.showInfo();
		taxi2692.showInfo();
		
		
	}
}
