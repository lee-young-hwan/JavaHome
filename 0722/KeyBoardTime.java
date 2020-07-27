/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class KeyBoardTime{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		int 시간;
		int 분;
		int 초;
		


		System.out.println("시간을 초 단위로 입력하시오 "  );

		int input = scan.nextInt(); 

		시간 = input / 3600;

		 분 = input % 3600 / 60;
		 
		 초 = input % 60;



		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", input, 시간, 분, 초);
	}
}