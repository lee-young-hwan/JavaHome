/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/
	/*
		�������� : Local variable, stack variable, automatic variable, temporary variable
		- Ư�� �޼ҵ�(�Լ�) Ȥ�� Ư�� block���� ����� ����
		- Ư�� �޼ҵ�(�Լ�)�� Ư�� ����� ����� �ڵ� �Ҹ�ǰ�, �� ���� ������ ������ �ڵ� ����
		- �ݵ�� ����ϱ� ���� �ʱ�ȭ�ؾ� �Ѵ�
		
	*/

import java.util.Scanner;

public class LocalVariableDemo{                
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int yearOfBorn; // ��������

		System.out.print("������ ����⵵��? : ");
		yearOfBorn = scan.nextInt();    // �� �� �ʱ�ȭ�� �ȴ�(yearOfBorn��)

		int age = 2020 - yearOfBorn + 1; // ��������, �� �� �ʱ�ȭ�� �ȴ�(age��)
		System.out.println("������ ���̴� " + age + "���̱���");

		/*{
		int age = 24; // main�� ����� �ڵ����� �Ҹ�ȴ�
		} 
		System.out.println("age = " + age); // age�� main �������� ������Ƿ� ������ ����.*/

	}
}