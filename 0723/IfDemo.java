/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class IfDemo{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("점수 : ");

		int jumsu = scan.nextInt();

		// 1유형(if문) , 문장이 1개면 괄호생략가능
		/*if (jumsu >= 60)
			System.out.println("필기 합격입니다.");

		if (jumsu < 60)
			System.out.println("아쉽게도 다음기회에");*/



		// 2유형(if-else문)
		/*if (jumsu >= 60){
			System.out.println("축하해요");
			System.out.println("필기 합격입니다");

		} else { // jumsu < 60
			System.out.println("아쉽습니다");
			System.out.println("다음 기회에 응시해주세요");
		}*/



		// 3유형(if-else if문)
		/*if (jumsu>=90) {
			System.out.println("축하합니다. 대단해요.");
			System.out.println("필기 합격입니다.");

		}else if (jumsu >= 60){ // 60 <= jumsu < 90
			System.out.println("Good.");
			System.out.println("필기 합격입니다.");

		}else if (jumsu >= 50){ // 50 <= jumsu < 60
			System.out.println("너무 아쉽습니다.");
			System.out.println("다음 기회에 응시해 주세요.");

		}else{ // jumsu < 50
			System.out.println("불합격입니다.");
		}*/		

		if(jumsu >= 60)
		{
			System.out.println("합격입니다.");

		if(jumsu >= 90)
			System.out.println("wow! 대단합니다."); // 60 <= jumsu, 90 <= jumsu

			else
			System.out.println("Good."); // 60 <= jumsu < 90
		}

		else
		{
			System.out.println("불합격입니다.");

		if(jumsu >= 50)
			System.out.println("정말 아쉽습니다."); // 50 <= jumsu < 60
			else
			System.out.println("좀더 분발하세요."); // jumsu < 50
		}
	}
}