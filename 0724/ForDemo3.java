/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ForDemo3{
	public static void main(String[] args) {

	/*	int count = 0;

		for(int i = 1; i <= 50; i++)
		{
			System.out.print("��  ");

			count++;

			if(count % 5 == 0)
				System.out.println();
		}*/

		
	/*	for(int i = 1; i <= 5; i++)
		{
			System.out.println("��"); // 5���� ���� ���ٿ� 1���� ���
		}*/




	/*	for(int i = 1; i <= 5; i++) // �ٱ��� �ִ� for���� ���ʿ� �ִ� for������ ���� �ݺ� ( 1~5�� �ݺ� ), ���η� 5�� ����ϴ� ����
			{
				for(int j = 1; j <= 10; j++) // ���ʿ� �ִ� for���� ������ �ݺ��� ( 1~10�� �ݺ� )   , ���η� 10���� ����ϴ� ����
				{
					System.out.print("��  ");
				}

				System.out.println();

			}		*/



	/*	for(int i = 1; i <= 26; i++) // ���η� ���(������ �ݺ�)
		{
			for(int j = 65; j <= 90; j++) // ���η� ���(������ ���)
			{
					System.out.print((char)j + "  ");
			}

			System.out.println();

		}*/



   
	/*	for(int i = 1; i <= 10; i++){

			for(int j = 1; j <= i; j++){
				System.out.print("�� ");
			}

			System.out.println();
		}*/


		

	/*	for(int i = 0; i <= 25; i++)
		{
			for(int j =65; j <= (65 + i); j++)
			{
				System.out.print((char)j + "  ");

				
			}

			System.out.println();
		}*/


	/*	char ch = 65;

		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= i && ch <= 90; j++)
			{
				System.out.print((char)ch + " ");
				ch++;
			}

			System.out.println();
			
		}*/



	/*	for(int i = 1; i <=5; i++)  // 012345
		{
			for(int j = 0; j<=5; j++)
			{
				System.out.print("" + j);
			}

			System.out.println();
		} */



	/*	for(int i = 0; i <= 5; i++)  // i�� ���� : 0~5����
		{

			for(int j = 1; j <= 5; j++) //j�� ���� : i�� 5���ݺ�
			{
				System.out.print("" + i);
			}
			System.out.println();
		}*/



	/*	for(int i = 0; i <= 4; i++)
		{
			for(int j = i; j <= i+5; j++)
			{
				System.out.print("" + j);
			}
			System.out.println();
		}*/


	/*	for(int i = 5; i >= 1; i--)   // �Ʊ�� �Ȱ��� ����翡�� i���� �ٲ��ָ� �ﰢ���� �ݴ�γ��´�
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("�� ");
			}
			System.out.println();150051150051150051150051150051150051150051
		}*/



		for(int i = 1; i <= 9; i++)        // ������
		{
			for(int j = 2; j <= 9; j++)
			{
				System.out.printf("%d x %d = %d\n", j, i, j * i);
			}
			System.out.println();
		}


	}
}