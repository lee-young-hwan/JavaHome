/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args) {
		/*System.out.print("������ ���̴� ? ");
		Scanner scan; //����
		scan = new Scanner(System.in); //�Ҵ�
		int age; //����
		age = scan.nextInt(); //�Է¹��ۿ��� �Ѱ��� ������ �о���̴� �Լ�
		System.out.println("������ ���̴� " + age + "���̱���");
		System.out.printf("������ ���̴� %d���̱���.\n", age);*/


		/*double height; //����
		double weight; 

		Scanner scan; //�ּ� ���� ����
		scan = new Scanner(System.in); //�ּ� ���� �Ҵ�

		System.out.print("Ű : ");
		height = scan.nextDouble(); //�� �Ҵ�

		System.out.print("������ : ");
		weight = scan.nextDouble();//�� �Ҵ�

		System.out.printf("Ű = %.1fcm\t������ = %.1fkg\n", height, weight);*/

		String name;  //�ּ� ���� ����
		Scanner scan; //�ּ� ���� ����

		scan = new Scanner(System.in); //�ּ� ���� �Ҵ�
		System.out.print("���� : ");
		name = scan.nextLine(); //�ּ� ���� �Ҵ�

		System.out.println("������ �̸��� " + name + "�̱���.");
		
		
	}
}