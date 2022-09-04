package ch07;

public class DogTest {
	public static void main(String[] args) {
		Dog [] dog = new Dog[5];

		Dog d1 = new Dog();
		d1.setName("바둑");
		d1.setType("코커");
		dog[0] = d1;
		
		dog[1] = new Dog();
		dog[1].setName("멍멍");
		dog[1].setType("시고르");
		
		dog[2] = new Dog();
		dog[2].setName("핑키");
		dog[2].setType("시츄");
		
		dog[3] = new Dog();
		dog[3].setName("장군");
		dog[3].setType("도베르만");
		
		dog[4] = new Dog();
		dog[4].setName("복실");
		dog[4].setType("불독");
		
		System.out.println("일반 for문");
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		
		System.out.println("향상된 for문");
		for (Dog d : dog) {
			System.out.println(d.showDogInfo());
		}
	}
}
