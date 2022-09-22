package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/22
 * 이름 : 김지홍
 * 내용 : 손익분기점 1712
 */

public class _01 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split(" ");

		int fCost = Integer.parseInt(arr[0]);
		int vCost = Integer.parseInt(arr[1]);
		int price = Integer.parseInt(arr[2]);

		int cnt = 0;
		
		while(true) {
			if(vCost >= price) {
				cnt = -1;
				System.out.println(cnt);
				break;
			}
			
			if(fCost < (price - vCost) * cnt) {
				System.out.println(cnt);
				break;
			}else {
				cnt++;
			}
			
		}
		br.close();
		
	}
}
