

public class ConstructorDemo1 {
public static void main(String[] args) {
	Calendar today = new Calendar();
	System.out.println("year = " + today.year);
	Calendar nextYear = new Calendar(2021,8,4);
	System.out.println("year = " + nextYear.year);
}
}

class Calendar{
	int year, month, day;
	public Calendar() { // 기본생성자 , Overriding
		this.year = 2020; this.month = 8; this.day = 4;
	}
	
	public Calendar(int year, int month, int day) { // Overloading(중복정의)
		this.year = year; this.month = month; this.day = day;
		
	}
}
