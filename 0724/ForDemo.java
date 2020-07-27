/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ForDemo{
	public static void main(String[] args) {

		int count = 0; // 하나도 안찍었으니까 0으로 선언
		int line = 1;

		for(int i = 65; i <= 90 ;i++ )
		{
			if(line % 2 == 0)  // line이 짝수 줄이라면
			{
				System.out.printf("%-5c", (char)(i+32));   // 소문자로 출력
			}

			else  // line이 홀수 줄이라면
			{
				System.out.printf("%-5c", (char)i);        // 대문자로 출력
			}

			

			count++;         // 1개 출력할 떄마다 카운트를 증가시킴


			if(count % 5 == 0) // 5개마다 줄을 바꿈
			{
				System.out.println();
				line++;
			}

		}


	}
}