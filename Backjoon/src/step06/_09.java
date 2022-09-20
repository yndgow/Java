package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/20
 * 이름 : 김지홍
 * 내용 : 크로아티아 알파벳 2941
 */

public class _09 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String [] strArr = input.split("");
		int size = strArr.length;
		
		for(int i=0; i<strArr.length; i++) {
			if(i == strArr.length-1) break; // 마지막 자리에서 검사 할때 break;
			switch (strArr[i]+strArr[i+1]) {
				case "c-" : case "c=" : case "d-" : case "lj" : case "nj" : case "s=" : case "z=" : 
					size--; // 두글자가 한글자로 되므로 전체 길이에서 -1 처리
				
			}
			
			// dz= 의 경우
			if(i <= strArr.length-3 && (strArr[i]+strArr[i+1]+strArr[i+2]).equals("dz=")) {
				size--; // z= 가 한번더 빠지므로 -1만 처리
			}
			
		}
		System.out.println(size);
		br.close();
	}
}
