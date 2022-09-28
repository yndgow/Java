package ch13;

import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		int max  = Arrays.stream(arr).max().getAsInt(); 
		
		System.out.println(sumVal);
		System.out.println(count);
		System.out.println(max);
	}
}