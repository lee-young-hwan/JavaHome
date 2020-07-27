/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/
	/*
		지역변수 : Local variable, stack variable, automatic variable, temporary variable
		- 특정 메소드(함수) 혹은 특정 block에서 선언된 변수
		- 특정 메소드(함수)나 특정 블록을 벗어나면 자동 소멸되고, 이 영역 안으로 들어오면 자동 생성
		- 반드시 사용하기 전에 초기화해야 한다
		
	*/

import java.util.Scanner;

public class LocalVariableDemo{                
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int yearOfBorn; // 지역변수

		System.out.print("귀하의 출생년도는? : ");
		yearOfBorn = scan.nextInt();    // 이 때 초기화가 된다(yearOfBorn이)

		int age = 2020 - yearOfBorn + 1; // 지역변수, 이 때 초기화가 된다(age가)
		System.out.println("귀하의 나이는 " + age + "살이군요");

		/*{
		int age = 24; // main을 벗어나면 자동으로 소멸된다
		} 
		System.out.println("age = " + age); // age가 main 범위에서 벗어났으므로 에러가 난다.*/

	}
}