import java.util.Arrays;

/*
 *  interface 활용편
 */

public class InterfaceDemo4 {
	public static void main(String[] args) {
		
		Student [] array = {
				new Student("김철수", 286, 95.5),
				new Student("이영희", 295, 98.5),
				new Student("한지민", 275, 91.3)
		};
		
//		String [] array = {"Hello", "이미자", "World", "Java", "서울시 강남구 역삼동"};
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].compareTo(array[j+1]) > 0) { // j번째 문자열이 더 크다면
					Student temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}		
		System.out.println(Arrays.toString(array));
	}
}
