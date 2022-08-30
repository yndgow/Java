package msub01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		int nCount;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		nCount = Integer.parseInt(br.readLine());

		for(int i=1; i<=nCount; i++) {
			for(int j=0; j<i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
