package ch052;

import java.util.Arrays;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	Integer [] arr = {1,3,5,7,8,10,12}; 
	
	public String isValid() {
		if(Arrays.asList(arr).contains(month) && day == 31) {
			return "유효한 날짜입니다";
		}else if(month == 2 && day > 29){
			return "유효한 날짜입니다";
		}else {
			return "유효하지 않은 날짜입니다";
		}
		
	}
	
	
}
