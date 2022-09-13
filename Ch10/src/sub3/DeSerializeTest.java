package sub3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김지홍
 * 내용 : 직렬화 / 역직렬화 실습하기
 */
public class DeSerializeTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\aplle.dat";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 내보내기(직렬화)
			
			Apple a1 = (Apple) ois.readObject();
			Apple a2 = (Apple) ois.readObject();
			
			ois.close();
			fis.close();

			a1.show();
			a2.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("역직렬화 완료...");
	}
}
