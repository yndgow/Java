package ch11;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate mdt = (MyDate)obj;
			if(this.day == mdt.day && this.month == mdt.month && this.year == mdt.year) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return year * 10000 + month * 100 + day;
	}
}

public class MydateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(18, 9, 2004);
		MyDate date2 = new MyDate(18, 9, 2004);
		System.out.println(date1.equals(date2));
		
		System.out.println("date1의 hashCOde : "+date1.hashCode());
		System.out.println("date2의 hashCOde : "+date2.hashCode());
	}
	
}
