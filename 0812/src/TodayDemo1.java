import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TodayDemo1 {
	public static void main(String[] args) {
		/*Calendar cal = new GregorianCalendar(2020, 7, 12);*/
		
		/*Calendar cal = Calendar.getInstance(Locale.US); 
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH+1);
		//int day = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("Today is " + year + "�� " + month + "�� " + day + "��.");*/
		
		Calendar cal = new GregorianCalendar(2020, 1, 1); // 2020�� 8�� 1��
		int yoil = cal.get(Calendar.DAY_OF_WEEK); // �Ͽ��� : 1 ~ 7(�����)
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(yoil);
	}
}
