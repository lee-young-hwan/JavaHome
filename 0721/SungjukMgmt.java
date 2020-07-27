/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class SungjukMgmt{
	public static void main(String[] args) {
		Student chulsu = new Student();
		Student.mat = 100; // static변수이기 때문에 여러개 만들어도 값이 최종적으로 1번만 나옴
		chulsu.kor = 90; // 멤버변수이기 때문에 여러개 만들면 똑같이 최종적으로 여러개가 나옴
		chulsu.eng = 85; // 멤버변수이기 때문에 여러개 만들면 똑같이 최종적으로 여러개가 나옴

		int total = chulsu.kor + chulsu.eng + Student.mat;
		System.out.println("철수의 총점 = " + total);

		Student younghee = new Student();
		younghee.kor = 95;
		younghee.eng = 100;
		//영희의 수학점수는 철수와 공유되기 때문에 삽입하지 않아도됨
		total = younghee.kor + younghee.eng + Student.mat;
		System.out.println("영희의 총점 = ", total);
	}
}
