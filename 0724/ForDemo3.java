/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ForDemo3{
	public static void main(String[] args) {

	/*	int count = 0;

		for(int i = 1; i <= 50; i++)
		{
			System.out.print("★  ");

			count++;

			if(count % 5 == 0)
				System.out.println();
		}*/

		
	/*	for(int i = 1; i <= 5; i++)
		{
			System.out.println("★"); // 5개의 별을 한줄에 1개씩 출력
		}*/




	/*	for(int i = 1; i <= 5; i++) // 바깥에 있는 for문은 안쪽에 있는 for문보다 적게 반복 ( 1~5번 반복 ), 세로로 5줄 출력하는 문장
			{
				for(int j = 1; j <= 10; j++) // 안쪽에 있는 for문은 여러번 반복함 ( 1~10번 반복 )   , 가로로 10개를 출력하는 문장
				{
					System.out.print("★  ");
				}

				System.out.println();

			}		*/



	/*	for(int i = 1; i <= 26; i++) // 세로로 출력(라인의 반복)
		{
			for(int j = 65; j <= 90; j++) // 가로로 출력(글자의 출력)
			{
					System.out.print((char)j + "  ");
			}

			System.out.println();

		}*/



   
	/*	for(int i = 1; i <= 10; i++){

			for(int j = 1; j <= i; j++){
				System.out.print("＊ ");
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



	/*	for(int i = 0; i <= 5; i++)  // i의 범위 : 0~5까지
		{

			for(int j = 1; j <= 5; j++) //j의 범위 : i를 5번반복
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


	/*	for(int i = 5; i >= 1; i--)   // 아까와 똑같은 별모양에서 i값만 바꿔주면 삼각형이 반대로나온다
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("★ ");
			}
			System.out.println();150051150051150051150051150051150051150051
		}*/



		for(int i = 1; i <= 9; i++)        // 구구단
		{
			for(int j = 2; j <= 9; j++)
			{
				System.out.printf("%d x %d = %d\n", j, i, j * i);
			}
			System.out.println();
		}


	}
}