/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class Jibul{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int 오만원권;
		int 만원권;
		int 오천원권;
		int 천원권;

		
		

		

		System.out.println("상품가격을 입력하세요 : ");
		int 총금액 = scan.nextInt();
		int 나머지 = scan.nextInt();

		오만원권 = (총금액 / 50000);
		만원권 = (총금액 % 50000) / 10000;
		오천원권 = (총금액 % 10000) / 5000;
		천원권 = (총금액 % 5000) / 1000;
		나머지 = 총금액 % 1000;

		
		

		

		
		
		System.out.printf("%d원은 5만원권 %d장, 만원권 %d장, 5천원권 %d장, 천원권 %d장을 지불하고 %d원이 남습니다.", 총금액, 오만원권, 만원권, 오천원권, 천원권, 나머지);

	}
}