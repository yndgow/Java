package sub08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2022/09/29
 * 이름 : 김지홍
 * 내용 : 자바 총정리 연습문제
 * 
*/

public class Test09 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Gugudan.txt";

		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x=2; x<=9; x++) {
//				fw.append(x+ "단\r\n");
				fw.write(x+ "단\r\n");
				
				for(int y=1; y<=9; y++) {
					int z = x * y;
//					fw.append(x + "x" + y + "=" + z + "\r\n");
					fw.write(x + "x" + y + "=" + z + "\r\n");
					
				}
			}
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("구구단 파일생성 완료...");
	}
}
