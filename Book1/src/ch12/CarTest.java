package ch12;


public class CarTest {
	
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Car soanta1 = factory.createCar("연수 차");
		Car soanta2 = factory.createCar("연수 차");
		System.out.println(soanta1 == soanta2);
		
		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1 == avante2);
		
		System.out.println(soanta1 == avante1);

	}
}
