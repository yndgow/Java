package msub01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count1 = 5;
		
		for(int i=0; i<count1; i++) {
			for(int j=count1-1; j>i; j--) {
				bw.write("☆");
			}
			for(int j=0; i>=j; j++) {
				bw.write("★");
			}
			bw.newLine();
		}
		bw.newLine();
		
		int count2 = 4;
		
		for(int i=0; i<count2; i++) {
			for(int j=count2-1; j>i; j--) {
				bw.write("☆");
			}
			for(int j=0; i*2>=j; j++) {
				bw.write("★");
			}
			for(int j=count2-1; j>i; j--) {
				bw.write("☆");
			}
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
