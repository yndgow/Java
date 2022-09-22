package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2022/09/22
 * 이름 : 김지홍
 * 내용 : 그룹단어 체커 1316
 */

public class _10 {

	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
		
		String input = "happyp";
		
		int [] arr = new int [26];
		
		
		
		for(int i=0; i<input.length(); i++) {
			arr[input.charAt(i)-97]++;
			
		}
		
		System.out.println(25+"");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=2) {
				for(int j=0; j<input.length(); j++) {
					char [] charArr = input.toCharArray();
					if(charArr[j] == (char)i+97) {
						
					}
					
				}
			}
		}
	}
}
