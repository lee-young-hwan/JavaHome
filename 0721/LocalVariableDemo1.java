/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class LocalVariableDemo1{
	public static void main(String[] args) {

		double height; // 지역변수
		Scanner scan;  // 지역변수 , 선언
		scan = new Scanner(System.in);  // 생성
		
		System.out.print("귀하의 키는 ?");
		height = scan.nextDouble();

		double inchi = height / 2.54;   // inchi는 지역변수
		double pit = inchi / 12;       // 지역변수

		System.out.printf("%.2fcm는 %.2f피트, %.2f인치 입니다.\n", height, pit, inchi);  


	}
}