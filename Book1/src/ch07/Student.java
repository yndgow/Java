package ch07;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String name;
	ArrayList<Subject> subjectList;
	
	
	public Student() {};
	
	public Student(int stduentID, String name) {
		this.studentID = stduentID;
		this.name = name;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScroePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + name + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + name + "의 총점은 " + total + "입니다.");
	}
}
