package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/19
 * 이름 : 김지홍
 * 내용 : 다이얼 5622
 */

public class _08 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int result = 0;
		
		for(int i=0; i<input.length(); i++) {
			int num = input.charAt(i)-65;
			
			if(num <= 2) {
				result += 3;
			}else if(num <= 5) {
				result += 4;
			}else if(num <= 8) {
				result += 5;
			}else if(num <= 11) {
				result += 6;
			}else if(num <= 14) {
				result += 7;
			}else if(num <= 18) {
				result += 8;
			}else if(num <= 21) {
				result += 9;
			}else if(num <= 25) {
				result += 10;
			}
		}
		System.out.println(result);
	}
}
