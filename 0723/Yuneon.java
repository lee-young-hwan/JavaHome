/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class Yuneon{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print ("���ش� �����ΰ���? :");

		int Yuneon = scan.nextInt();

		if ((Yuneon % 4 == 0 && Yuneon % 100 != 0) || Yuneon % 400 == 0)
		{
			System.out.println("���ش� �����Դϴ�.");
		}
		else
		{
			System.out.println("���ش� ������ �ƴմϴ�.");
		}
	}
}