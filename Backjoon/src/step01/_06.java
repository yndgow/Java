package step01;
import java.util.Scanner;
/*
 * 날짜 : 2022/08/19
 * 이름 : 김지홍
 * 내용 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오. 1008
 */

public class _06{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		double num3 = num1 / num2;
		System.out.println(num3);
		sc.close();
    }
}