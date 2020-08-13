import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericDemo1 {
	public static void main(String[] args) {
//		ArrayList<String> array = new ArrayList<String>();
//		array.add("Hello");
//		array.add("World");
//		array.add("Java");
//		for (int i = 0; i < array.size(); i++) {
//			System.out.println(array.get(i));
//		}
//	 	
//		ArrayList<Integer> array1 = new ArrayList<Integer>();
//		array1.add(5); array1.add(7); array1.add(9);
//		int su = array1.get(0);
		
		//Object obj = new String("Hello");
		//ArrayList<Object> obj = new ArrayList<Stirng>()); // 지네릭은 형변환을 할 수 없다
		//ArrayList<? super Car> obj = new ArrayList<String>();
		//ArrayList<Integer> intList = new ArrayList<Integer>();
		//intList.add(5); intList.add(7);
		//ArrayList<Integer> intList = (ArrayList<Integer>)Arrays.asList(4,5,6,7,8);
		// String str = (String)obj;
		//ArrayList<Double> doubleList = (ArrayList<Double>)Arrays.asList(2.3, 4.5, 6.7, 8.9);
		//ArrayList<String> stringList = (ArrayList<String>)Arrays.asList("Hello", "World", "Java", "Python");
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(4); intList.add(5); intList.add(6);
		//print(intList);
		
		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(2.3); doubleList.add(4.5); doubleList.add(7.8);
		//print(doubleList);
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Hello"); stringList.add("World");
		//print(stringList);
		
	}
	static void print(List<? super Number> list) { // ?는 Number와 Number의 자식만 가능
		for ( Object a : list ) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}
}
