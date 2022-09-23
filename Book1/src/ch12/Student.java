package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class Student {

	private String stId;
	private String stName;
	
	public Student(String stId, String stName) {
		this.stId = stId;
		this.stName = stName;
	}
	
	public String getStId() {
		return stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(stId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.stId == student.getStId()) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return stId + ":" + stName;
	}
	
	
}
