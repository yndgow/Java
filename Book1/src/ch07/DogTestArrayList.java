package ch07;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> da = new ArrayList<Dog>();
		
		Dog d1 = new Dog();
		d1.setName("바둑");
		d1.setType("코커");
		da.add(d1);
		
		Dog d2 = new Dog();
		d2.setName("삽살");
		d2.setType("삽살개");
		da.add(d2);
		
		Dog d3 = new Dog();
		d3.setName("덩치");
		d3.setType("그레이하운드");
		da.add(d3);
		
		Dog d4 = new Dog();
		d4.setName("삐삐");
		d4.setType("치와와");
		da.add(d4);
		
		Dog d5 = new Dog();
		d5.setName("로드");
		d5.setType("페키니즈");
		da.add(d5);
		
		for(Dog d : da) {
			System.out.println(d.showDogInfo());
		}
	}
	
}
