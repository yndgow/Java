package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2022/08/30
 * 이름 : 김지홍
 * 내용 : OX퀴즈 8958
 */
public class _05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		count = Integer.parseInt(br.readLine());
		
		String result;
		
		for(int i=0; i<count; i++) {
			result = br.readLine();
			String [] arr = result.split("");
			int score = 0;	
			for(int j=0; j<3; j++) {
				if(arr[j].equals("O")) {
					score++;
					if( j>0 && arr[j-1].equals("O") && arr[j].equals("O")) {
						score++;
					}
				}
				System.out.print(score);
			}
			System.out.println(score);
		}
	}
}
