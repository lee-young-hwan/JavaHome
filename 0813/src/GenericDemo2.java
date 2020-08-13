import java.util.Arrays;
import java.util.List;

public class GenericDemo2 {
	public static void main(String[] args) {
		Sonata [] array = new Sonata[] {new Sonata("Red Sonata", 25_000_000, "red"),
				                        new Sonata("Blue Sonata", 28_000_000, "blue"),
				                        new Sonata("Black Sonata", 30_000_000, "black")};
		List<Sonata> sonataList = Arrays.asList(array);
		//sort(sonataList);
		
		
		Carnival [] array1 = new Carnival[] {new Carnival("Red Carnival", 25_000_000, "red"),
                new Carnival("Blue Carnival", 28_000_000, "blue"),
                new Carnival("Black Carnival", 30_000_000, "black")};
List<Carnival> carnivalList = Arrays.asList(array1);
sort(carnivalList);

		
		//List<Integer> intList = Arrays.asList(new Integer[]{1,2,3,4,5});
		//sort(intList);
	}
	static <T extends Car & Comparable> void sort(List<T> carList) { // generic method
		System.out.println("<<Before Sorting>>");
		System.out.println(carList);
		Object [] array = carList.toArray();
		
		Arrays.sort(array);
		System.out.println("<<After Sorting>>");
		System.out.println(Arrays.toString(array));
	}
}
