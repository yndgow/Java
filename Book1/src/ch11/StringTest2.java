package ch11;

public class StringTest2 {
	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androiStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androiStr);
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javaStr));

	}
}
