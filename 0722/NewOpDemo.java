/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class NewOpDemo{
	public static void main(String[] args) {
		Scanner scan = null; //선언, 지역변수이자 참조변수
		scan = new Scanner(System.in);
		scan = new Scanner(new File());

		String irum = null; // null = 아무것도 가지지 않는 값

		irum = new String("한지민"); // 모든 참조형은 new를 써야함
		System.out.printf("이름 = %s\n", irum);
		
		irum = new String("김지민");
		System.out.printf("이름 = %s\n", irum);

		irum = "한"; // new String("한");
		irum = irum + "지민"; //irum + new String("지민"); -> new String("한" + "지민")이라는 뜻
		

	}
}