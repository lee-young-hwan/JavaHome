/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;
public class SungjukMgmt{
	public static void main(String[] args) {
		

		Scanner scan;

		String 학번;
		String 이름;
		int 국어;
		int 영어;
		int 수학;
		

		 scan = new Scanner(System.in);

		System.out.print("학번 : ");
		학번 = scan.nextLine();
		System.out.println("학번은 " + 학번 + "입니다.");

		System.out.print("이름 : ");
		이름 = scan.nextLine();
		System.out.println("이름은 " + 이름 + "입니다.");

		System.out.print("국어 : ");
		국어 = scan.nextInt();
		System.out.println("국어는 " + 국어 + "입니다.");

		System.out.print("영어 : ");
		영어 = scan.nextInt();
		System.out.println("영어는 " + 영어 + "입니다.");

		System.out.print("수학 : ");
		수학 = scan.nextInt();
		System.out.println("수학은 " + 수학 + "입니다.");

		int 총점;
		총점 = 국어 + 영어 + 수학;

		double 평균;
		평균 = 총점 / 3.0;

		
		System.out.println("총점은 " + 총점 + "입니다.");

		System.out.println("평균은 " + 평균 + "입니다.");
 



		
	}
}