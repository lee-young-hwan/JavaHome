import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int first = scan.nextInt();
		
		System.out.print("�ι�° ����(0�� ����) : ");
		int second = scan.nextInt();
		try {
		System.out.println(first / second);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("���� ó������.");
		} catch(ClassCastException ex){
			System.out.println("�̹����� ����");
		} catch(Exception ex) {  // �ڽ��� �θ������� ����ȯ�� �Ǳ� ������ ��� ���ܸ� ��Ƴ� �� ����
			System.out.println("�ᱹ ����");
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
