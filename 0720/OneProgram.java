/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class OneProgram{
	public static void main(String[] args) {
		
	Scanner	scan = new Scanner(System.in);
		double boo;
		int r;
		int height;
		double pi = 3.14;
		System.out.print("�������� �Է��ϼ��� :");
r = scan.nextInt();


System.out.print("���̸� �Է��ϼ��� :");
height = scan.nextInt();

        boo = r * r * pi * height;
		
		System.out.printf("������� ���Ǵ� %.2f�Դϴ�.", boo);



	}
}