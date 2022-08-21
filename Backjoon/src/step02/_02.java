package step02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* 
 * 날짜 : 2022/08/20
 * 이름 : 김지홍
 * 내용 : 시험성적 9498
 */
public class _02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.valueOf(br.readLine());
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		if(score >= 90 && score <= 100) {
			bw.write('A');
		}else if(score >= 80 && score <= 89) {
			bw.write('B');
		}else if(score >= 70 && score <= 79) {
			bw.write('C');
		}else if(score >= 60 && score <= 69){
			bw.write('D');
		}else {
			bw.write('F');
		}
		bw.flush();
		bw.close();
	}
}
