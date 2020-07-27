/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class DoWhileDemo2{
	public static void main(String[] args) {
		for(int i = 1; i < 6 ;i++)
		{
			int j = 1;       // 초기값

			do
			{
				if(i == j)
				
					System.out.printf("%3d", i);
				
				else
				
					System.out.printf("%3d", 0);
				
				j++;         // 증감치
			}
			while (j < 6); // 조건
			System.out.println();
		}
	}
}