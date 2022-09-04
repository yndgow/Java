package ch07;

import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> stdArrayList = new ArrayList<Student>();
		
		stdArrayList.add(new Student(1001, "James"));
		stdArrayList.add(new Student(1002, "Tomas"));
		stdArrayList.add(new Student(1003, "Edward"));
		
		for (Student student : stdArrayList) {
			student.showStudentInfo();
		}
		
	}
}
