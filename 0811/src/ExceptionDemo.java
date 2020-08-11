import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int first = scan.nextInt();
		
		System.out.print("두번째 정수(0은 제외) : ");
		int second = scan.nextInt();
		try {
		System.out.println(first / second);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("내가 처리했음.");
		} catch(ClassCastException ex){
			System.out.println("이번에는 과연");
		} catch(Exception ex) {  // 자식은 부모형으로 형변환이 되기 때문에 모든 예외를 잡아낼 수 있음
			System.out.println("결국 내가");
		}
//		Student1 sujan = new Student1();
//		System.out.println(sujan.name);
//		sujan = null;
//		System.out.println(sujan.name);
		
		//int [] array = new int[4];
		//for (int i = 0; i < 4; i++) System.out.println(array[i]);
		
	}
}

class Student1{
	String name = "Sally";
	
}
