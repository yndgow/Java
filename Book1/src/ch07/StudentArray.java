package ch07;

public class StudentArray {
	public static void main(String[] args) {
		Student [] std = new Student[3];
		
		std[0]= new Student(1001, "James");
		std[1]= new Student(1002, "Tomas");
		std[2]= new Student(1003, "Edward");
		
		for(Student a : std) {
			a.showStudentInfo();
		}
		
	}
}
