/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class IfDemo{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("���� : ");

		int jumsu = scan.nextInt();

		// 1����(if��) , ������ 1���� ��ȣ��������
		/*if (jumsu >= 60)
			System.out.println("�ʱ� �հ��Դϴ�.");

		if (jumsu < 60)
			System.out.println("�ƽ��Ե� ������ȸ��");*/



		// 2����(if-else��)
		/*if (jumsu >= 60){
			System.out.println("�����ؿ�");
			System.out.println("�ʱ� �հ��Դϴ�");

		} else { // jumsu < 60
			System.out.println("�ƽ����ϴ�");
			System.out.println("���� ��ȸ�� �������ּ���");
		}*/



		// 3����(if-else if��)
		/*if (jumsu>=90) {
			System.out.println("�����մϴ�. ����ؿ�.");
			System.out.println("�ʱ� �հ��Դϴ�.");

		}else if (jumsu >= 60){ // 60 <= jumsu < 90
			System.out.println("Good.");
			System.out.println("�ʱ� �հ��Դϴ�.");

		}else if (jumsu >= 50){ // 50 <= jumsu < 60
			System.out.println("�ʹ� �ƽ����ϴ�.");
			System.out.println("���� ��ȸ�� ������ �ּ���.");

		}else{ // jumsu < 50
			System.out.println("���հ��Դϴ�.");
		}*/		

		if(jumsu >= 60)
		{
			System.out.println("�հ��Դϴ�.");

		if(jumsu >= 90)
			System.out.println("wow! ����մϴ�."); // 60 <= jumsu, 90 <= jumsu

			else
			System.out.println("Good."); // 60 <= jumsu < 90
		}

		else
		{
			System.out.println("���հ��Դϴ�.");

		if(jumsu >= 50)
			System.out.println("���� �ƽ����ϴ�."); // 50 <= jumsu < 60
			else
			System.out.println("���� �й��ϼ���."); // jumsu < 50
		}
	}
}