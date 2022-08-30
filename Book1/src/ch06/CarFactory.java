package ch06;

public class CarFactory {
	
	
	private static CarFactory instance = new CarFactory();

	CarFactory(){};
	
	public static CarFactory getInstance() {
		if(instance == null) instance = new CarFactory();
		return instance;
	}
	
	public Car creatCar() {
		Car car = new Car();
		return car;
	}
}
