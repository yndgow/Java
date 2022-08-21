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
 * 내용 : 오븐시계 2525
 */
public class _06{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cTime = br.readLine();
		String eTime = br.readLine();
		br.close();
		
		StringTokenizer st = new StringTokenizer(cTime, " ");

		int h = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(eTime);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int mTime = (h*60+m)+c;
		h = mTime / 60;
		m = mTime % 60;
		if(h >= 24) {
			h -= 24;
		}
		
		
		bw.write(h+" "+m);
		bw.flush();
		bw.close();
	}
}