package ch05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKim = new Student();
		studentKim.studentName = "김지홍";
		
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
	}

}
