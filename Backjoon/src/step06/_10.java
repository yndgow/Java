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

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int result = count;

//		String input = "happyp";
		
		for (int k = 0; k < count; k++) {
			String input = br.readLine();
			for (int i = 0; i < input.length(); i++) {

				int start = input.indexOf(input.charAt(i));
				int end = input.lastIndexOf(input.charAt(i));

				for (int j = start; j <= end; j++) {
					if (input.charAt(j) != input.charAt(i)) {
//						System.out.print("X");
						result--;
						break;
					} else {
//						System.out.print("O");
					}
				}
//				System.out.println();
			}
		}
		System.out.println(result);

	}
}
