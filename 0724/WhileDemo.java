/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class WhileDemo{
	public static void main(String[] args) {
		//1, 2, 3, 4, 5

		/*int i = 1; // �ʱ�ȭ 
		while (i <= 5) // ����
		{
			System.out.print(i+ "   ");
			i++; // ����ġ
		}*/



	/*	int i = 1; // �ʱ�ġ                                        int i = 1; //�ʱ�ġ
		while (i <= 100) // ����                                   while( i <= 100)
		{                                                       //{ i++ } : while���� ����� �ٷ� ��ȣ�ȿ� ����ġ(i++) ���� �̸� �־�д� 
			if (i % 7 == 0)
				System.out.print(i + "   ");
				i++; // ����ġ ��(����� �ʰ� ����)��
			
		}*/


/*

		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(������ �Է��Ͻø� ��)");

		int max = 0, mynum;

		while((mynum = scan.nextInt()) >= 0)
		{
			

			if (mynum < 0)
				break;


			if ( max < mynum )
				max = mynum;
			
			System.out.println("max = " + max);
			
		}*/




	/*	int i = 1;		
		
		while(i<10)
		{
			
			int j = 2;

			while(j<10)
			{

				System.out.printf("%d x %d = %d\n", j, i, j * i);

				j++;
			}
			System.out.println();
			i++;

		} */


		int i = 1;
		int sum = 0;


		while(true)
		{

			if(sum > 1000000)
				break;

			sum += i;
			
			i++;
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);


	}
}