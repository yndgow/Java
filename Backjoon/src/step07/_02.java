package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/23
 * 이름 : 김지홍
 * 내용 : 벌집 2292 
 */

public class _02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		br.close();
		int count = 0;
		int i = 1;

		while(true) {
			if(input > count +1) {
				count += (6 * i);
				i++;
			}else {
				System.out.println(i);
				break;
			}
		}
	}
}