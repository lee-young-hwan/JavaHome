import java.util.Date;
import java.util.Hashtable;

public class TodayDemo {
	public static void main(String[] args) {
		Date now = new Date();
		//System.out.println(now); // now.toString()
		//System.out.println(now.getYear()); // 1970년부터, 1900년부터 
		//System.out.println(now.getMonth());
		
		String [] array = now.toString().split("\\s+"); // Wed Aug 12 17:11:29 KST 2020
		System.out.println("Today is " + array[5] + "년 " + getMonth(array[1]) + "일 " + array[2] + "일입니다.");
	}
	
	static int getMonth(String month) {
		Hashtable ht = new Hashtable();
		ht.put("Jan", 1); ht.put("Feb", 2); ht.put("Mar", 3);
		ht.put("Apr", 4); ht.put("May", 5); ht.put("Jun", 6);
		ht.put("Jul", 7); ht.put("Aug", 8); ht.put("Sep", 9);
		ht.put("Oct", 10); ht.put("Nov", 11); ht.put("Dec", 12);
		return (Integer)ht.get(month);
	}
}
