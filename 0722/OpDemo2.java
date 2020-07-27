/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class OpDemo2{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int first, second; //선언

		System.out.print("첫번째 숫자 : "); 
		first = scan.nextInt();

        System.out.print("두번째 숫자 : "); 
		second = scan.nextInt();

		System.out.printf("%d + %d = %d\n", first, second, (first + second));
		System.out.printf("%d - %d = %d\n", first, second, (first - second));
		System.out.printf("%d x %d = %d\n", first, second, (first * second));
		System.out.printf("%d / %d = %d\n", first, second, (first / second));
		System.out.printf("%d %% %d = %d\n", first, second, (first % second)); // %를 %처리해줘야 제대로 출력된다

	}
}