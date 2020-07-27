/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ReferenceCopyTest{
	public static void main(String[] args) {

		Student chulsu = new Student();
		chulsu.age = 24;  // chulsu = 지역변수

		Student younghee = new Student();
		younghee.age = chulsu.age; // younghee = 지역변수

		System.out.printf("철수의 나이 = %d,", chulsu.age);
		System.out.printf("영희의 나이 = %d\n", younghee.age);

		chulsu.age = 34;
		
		System.out.printf("철수의 나이 = %d,", chulsu.age);
		System.out.printf("영희의 나이 = %d\n", younghee.age);

		/*

		1.대상 : int이기 때문에 primivate 타입이어서 기본형 (값복사)
		

		*/


	}
}

class Student
{
	int age;
}