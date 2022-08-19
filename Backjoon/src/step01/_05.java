package step01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 김지홍
 * 내용 : 두 정수 A와 B를 입력받은 다음, A*B를 출력하는 프로그램을 작성하시오. 10998
 */
import java.util.Scanner;
public class _05{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 * num2);
		sc.close();
    }
}