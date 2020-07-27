/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class ForDemo2{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("몇 단 ?: "); // 몇 단을 출력할 건지의 출력문 선언

		int dan = scan.nextInt(); // 사용자가 출력문에 몇 단인지를 입력

		for(int i = 1; i < 10; i++)
		{
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);  // dan = 사용자가 입력한 숫자니까 고정숫자이기 때문에 i를 반복시킨다
		}

	}
}