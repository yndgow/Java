package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/19
 * 이름 : 김지홍
 * 내용 : 상수 2908
 */

public class _07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String [] strArr = s.split(" "); // split 으로 잘라서 배열에 넣기
		String [] chArr = null; // 앞뒤를 바꿀때 사용할 배열
		String [] chArr2 = {"",""}; // 바꾼 숫자를 넣을 배열
		
		for(int i=0; i<strArr.length; i++) {
			chArr = strArr[i].split("");
			String c0 = chArr[0];
			chArr[0] = chArr[2];
			chArr[2] = c0;
			chArr2[i] = chArr[0] + chArr[1] + chArr[2];
		}
		if(Integer.parseInt(chArr2[0])>Integer.parseInt(chArr2[1])) {
			System.out.println(chArr2[0]);
		}else {
			System.out.println(chArr2[1]);
		}
		
		br.close();
	}
}
