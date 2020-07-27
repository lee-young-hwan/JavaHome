/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class NineTimesTable{
	public static void main(String[] args) {

		
		int i = 1;  // 초기화

		do
		{
			int j = 2;
			do
			{
				System.out.printf("%d x %d = %d  ", j, i , j * i);
				j++;  // 증감치
			}
			while (j < 10); // 조건
			System.out.println();
			
			i++; // 증감치
		}
		while (i < 10); // 조건
		
	}
}


