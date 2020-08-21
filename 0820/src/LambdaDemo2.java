import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 

public class LambdaDemo2 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,7,1,2,9,3,8,2,5);
		
		// ¿ø·¡ ÄÚµå
		//Collections.sort(list, (a,b) -> a.compareTo(b) * -1);	
		//System.out.println(Arrays.toString(list.toArray()));
		List<String> list1 = Arrays.asList("Hello", "Java", "Oracle", "apple", "ÇÑÁö¹Î", "¹ÚÁö¹Î", "±èÁö¹Î", "123");
		Collections.sort(list1, (a, b) -> a.compareTo(b) * -1);
		System.out.println(Arrays.toString(list1.toArray()));
		
	}
}
