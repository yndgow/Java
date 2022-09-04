package ch07;

public class EngancedForLoop {
	public static void main(String[] args) {
		String [] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
		
		int [] numArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int num : numArray) {
			System.out.println(num);
		}
	}
}
