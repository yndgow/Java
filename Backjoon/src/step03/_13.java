package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _13 {
	/* 
	 * 날짜 : 2022/08/21
	 * 이름 : 김지홍
	 * 내용 : 더하기사이클 1110
	 */
	public static void main(String[] args) throws IOException {
		int num;
		int inputNum;
		int num1;
		int num2;
		int sum;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		inputNum = Integer.parseInt(br.readLine());
		num = inputNum;
		int i = 1;

		while (true) {
			num1 = (inputNum < 10) ? 0 : inputNum / 10;
			num2 = inputNum % 10;
			
			sum = num1 + num2;
		 
			if(sum >= 10) {
				sum = sum % 10;
			}
			
			sum += num2 * 10;

			if(num == sum) {
				bw.write(i + "");
				break;
			}
			
			inputNum = sum;
			i++;
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
