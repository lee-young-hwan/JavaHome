import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		Student [] array = new Student [3];
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Name : "); String name = scan.next();
			System.out.print("Age : ");  int age = scan.nextInt();
			System.out.print("Major : "); String major = scan.next();
			
			Student s = new Student(name, age, major);
			array[i] = s;
		}

		for (Student s : array) System.out.println(s);	
	
		// ��ö��, 24, �濵 / �̿���, 34, �ɸ� / ������, 28, �İ�
		
		
	}
}
