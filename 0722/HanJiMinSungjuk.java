/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class HanJiMinSungjuk{
	public static void main(String[] args) {

		Student jimin = new Student();
		Scanner scan = new Scanner(System.in);
		

		System.out.print("학번 : "); 		
		String id = scan.nextLine();  // 2020-001
		jimin.id = id;     // 2020-001


		System.out.print("이름 : "); 		
		String name = scan.nextLine();
		jimin.name = name; // 한지민
		

		System.out.print("국어 : "); 
		jimin.kor = scan.nextInt();

		System.out.print("영어 : "); 
		jimin.eng = scan.nextInt();

		System.out.print("수학 : "); 
		jimin.mat = scan.nextInt();

		jimin.total = jimin.kor + jimin.eng + jimin.mat;
		jimin.avg = jimin.total / 3.;
		jimin.grade = (jimin.avg >= 90) ? 'A' :
			          (jimin.avg >= 80) ? 'B' :
			          (jimin.avg >= 70) ? 'C' :
			          (jimin.avg >= 60) ? 'D' : 'F';

		System.out.printf("%s(%s)의 성적표\n", jimin.name, jimin.id);
		System.out.printf("총점은 %d, 평균은 %.2f, 학점은 %s입니다.", jimin.total, jimin.avg, jimin.grade);





	}
}