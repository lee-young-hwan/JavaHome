/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class Seven3jul{
	public static void main(String[] args) {

		
		int count = 1;

		for (int i=1 ;i <= 100 ;i++)
		{
			if (i % 7 ==0)                       // 7의 배수를 출력
			{
				System.out.print(i + "   ");

				 
			if(count % 3 ==0)                    // 1줄에 3개씩 출력
				System.out.println();

			}

			count++;                             // 1개 출력할 떄마다 카운트를 증가시킴
		} 
	}
}