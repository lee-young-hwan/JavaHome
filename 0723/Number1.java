/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class Number1{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("ù° �� :");
		int a = scan.nextInt();

		System.out.print("��° �� :");
		int b = scan.nextInt();

		System.out.print("��° �� :");
		int c = scan.nextInt();

		int max;
		int min;		

		max = a; // max�� ������� ���� ������ ���Ƿ� �������ش�

		if (max < b)
			max = b;
		
		if (max < c)
			max = c;


		min = a;

		if (min > b)
			min = b;

		if (min > c)
			min = c;

		System.out.printf("%d�� %d�� %d�߿� ���� ū ���� %d�Դϴ�.\n", a, b, c, max);
		System.out.printf("%d�� %d�� %d�߿� ���� ���� ���� %d�Դϴ�.\n", a, b, c, min);

		
	}
}