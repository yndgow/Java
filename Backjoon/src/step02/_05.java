package step02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
 * 날짜 : 2022/08/20
 * 이름 : 김지홍
 * 내용 : 알람시계 2884
 */
public class _05{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		br.close();
		
		StringTokenizer st = new StringTokenizer(input, " ");

		int h = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ftime = (h*60+m)-45;
		if(h>0) {
			h = ftime / 60;
			m = ftime % 60;
					
		}else if(m<45) {
			h = 23;
			m += 15;
		}else {
			m -= 45;
		}
		
		bw.write(h+" "+m);
		bw.flush();
		bw.close();
	}
}