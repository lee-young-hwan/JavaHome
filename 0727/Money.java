/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class Money{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int [] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        String y_n = null;
	do{
		System.out.print("Money : ");

		int money = scan.nextInt();


		for (int i = 0;i < array.length; i++)
		{
			System.out.println(array[i] + " ���� : " + money / array[i]);
			money = money % array[i];
		}
		
		System.out.print("Again(y / n)? : ");
		y_n = scan.nextLine();
	} while (y_n.equals("y"));
	{
	}




		



	}
} 