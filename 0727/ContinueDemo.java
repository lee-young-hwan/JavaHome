/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ContinueDemo{
	public static void main(String[] args) {
		int i = 1;         // 초기값
		do
		{
			if (i % 7 == 0)
			{
				System.out.printf("%-3d", i);
			}
			else continue; // 7의 배수가 아니면 증감을 계속하기 ex) 8 9 10 11 12 13 15 16..
			i++;           // 증감치
		}
		while (i <= 100);  // 조건
	}
}