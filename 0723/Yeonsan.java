/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class Yeonsan{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("ù��° �� :");
		int a = scan.nextInt();

		System.out.print("�����ȣ�� �Է��ϼ��� :");
		int x = scan.nextInt();

		System.out.print("�ι�° �� :");
		int b = scan.nextInt();

		switch (x)
		{
		case 1 : System.out.print("����� " + (a + b) + "�Դϴ�."); break;
		case 2 : System.out.print("����� " + (a - b) + "�Դϴ�."); break;
		case 3 : System.out.print("����� " + (a * b) + "�Դϴ�."); break;
		case 4 : System.out.print("����� " + (a / b) + "�Դϴ�."); break;
		case 5 : System.out.print("����� " + (a % b) + "�Դϴ�."); break;
		default : System.out.print("�߸��� �������Դϴ�.");break;
		}

	    


	}
}