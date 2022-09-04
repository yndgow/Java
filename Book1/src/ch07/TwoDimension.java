package ch07;

public class TwoDimension {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		char [][] alp = new char [13][2];
		
		char a = 'A';
		
		for(int i=0; i<alp.length; i++) {
			for(int j=0; j<alp[i].length; j++) {
				alp [i][j] = a;
				a++;
			}
		}
		
		for(int i=0; i<alp.length; i++) {
			for(int j=0; j<alp[i].length; j++) {
				System.out.println(alp[i][j]);
			}
			System.out.println();
		}
	}
}
