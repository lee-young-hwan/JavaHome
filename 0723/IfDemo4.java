/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class IfDemo4{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("�̸� :");

		String name = scan.nextLine();


		System.out.print("Ű :");

		double height = scan.nextDouble();


		System.out.print("������ :");

		double weight = scan.nextDouble();


		double bmi = weight / ((height / 100)*(height / 100));


		String result; 
		
		if (bmi>=40)
		{
			result = "�� ��";
		}

		else if (bmi>=35)
		{
			result = "������ ��";
		}

		else if (bmi>=30)
		{
			result = "�浵 ��";
		}

		else if (bmi>=25)
		{
			result = "��ü��";
		}

		else if (bmi>=18.5 && bmi<23)
		{
			result = "����";
		}

		else
		{
			result = "��ü��";
		}


		System.out.printf("%s���� bmi������ %.2f�̰� %s�Դϴ�.", name, bmi, result);

		
	}
}