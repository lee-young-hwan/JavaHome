/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class Jibul{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int ��������;
		int ������;
		int ��õ����;
		int õ����;

		
		

		

		System.out.println("��ǰ������ �Է��ϼ��� : ");
		int �ѱݾ� = scan.nextInt();
		int ������ = scan.nextInt();

		�������� = (�ѱݾ� / 50000);
		������ = (�ѱݾ� % 50000) / 10000;
		��õ���� = (�ѱݾ� % 10000) / 5000;
		õ���� = (�ѱݾ� % 5000) / 1000;
		������ = �ѱݾ� % 1000;

		
		

		

		
		
		System.out.printf("%d���� 5������ %d��, ������ %d��, 5õ���� %d��, õ���� %d���� �����ϰ� %d���� �����ϴ�.", �ѱݾ�, ��������, ������, ��õ����, õ����, ������);

	}
}