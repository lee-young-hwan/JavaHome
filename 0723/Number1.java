/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class Number1{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("첫째 수 :");
		int a = scan.nextInt();

		System.out.print("둘째 수 :");
		int b = scan.nextInt();

		System.out.print("셋째 수 :");
		int c = scan.nextInt();

		int max;
		int min;		

		max = a; // max는 결과값이 들어가는 변수로 임의로 선언해준다

		if (max < b)
			max = b;
		
		if (max < c)
			max = c;


		min = a;

		if (min > b)
			min = b;

		if (min > c)
			min = c;

		System.out.printf("%d과 %d와 %d중에 가장 큰 수는 %d입니다.\n", a, b, c, max);
		System.out.printf("%d과 %d와 %d중에 가장 작은 수는 %d입니다.\n", a, b, c, min);

		
	}
}