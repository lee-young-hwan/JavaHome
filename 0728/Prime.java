/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class Prime{
	public static void main(String[] args){

		int [] array = new int[200];

		int count = 0; 

		for (int i = 2; i < 200 ;i++)
		{
			array[i] = i; // 0 0 2 3 4 5 6 7 8 ... 199
		}

		for (int i = 2;i < 200 ;i++)
		{
			if (array[i] != 0)
			{
				System.out.printf("%5d", i);  // 2, 3, 5, 7, 11 ... 
				count++;    // 하나씩 늘어날때마다 count 증가
				if(count % 10 == 0)
				{
					System.out.println();
				}
			}

			for (int j = i;j < 200 ;j += i )
			{
				array[j] = 0;
			}
		}
		System.out.println("\n소수의 개수 : " + count + "개");

		
	}
}