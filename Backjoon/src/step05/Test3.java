package step05;
/*
 * 날짜 : 2022/09/01
 * 이름 : 김지홍
 * 내용 : 한수 1065
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		hansu(num);
	}
	static int hansu(int num) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(num % 10);
		
		num /= 10;
		
		if(num != 0) {
			return hansu(num);
		}else {
			arr.size();
			arr.get(arr.size()-1);
			return 0;
		}
		
	}
}
