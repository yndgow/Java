package step01;

import java.util.Scanner;
/*
 * 날짜 : 2022/08/19
 * 이름 : 김지홍
 * 내용 : 나머지 10430
 */
public class _11 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
         
		 int a[] = new int[3];
         
		 for(int i=0; i<3; i++){
             a[i] = sc.nextInt();
         }
         
		 int A = a[0];
		 int B = a[1];
		 int C = a[2];
		 
		 int result1 = (A+B)%C;
		 int result2 = ((A%C)+(B%C))%C;
		 int result3 = (A*B)%C;
		 int result4 = ((A%C)*(B%C))%C;
		 
		 System.out.println(result1);
		 System.out.println(result2);
		 System.out.println(result3);
		 System.out.println(result4);
		 
		 sc.close();
	}
}
