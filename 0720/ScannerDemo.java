/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args) {
		/*System.out.print("귀하의 나이는 ? ");
		Scanner scan; //선언
		scan = new Scanner(System.in); //할당
		int age; //선언
		age = scan.nextInt(); //입력버퍼에서 한개의 정수를 읽어들이는 함수
		System.out.println("귀하의 나이는 " + age + "살이군요");
		System.out.printf("귀하의 나이는 %d살이군요.\n", age);*/


		/*double height; //선언
		double weight; 

		Scanner scan; //주소 변수 선언
		scan = new Scanner(System.in); //주소 변수 할당

		System.out.print("키 : ");
		height = scan.nextDouble(); //값 할당

		System.out.print("몸무게 : ");
		weight = scan.nextDouble();//값 할당

		System.out.printf("키 = %.1fcm\t몸무게 = %.1fkg\n", height, weight);*/

		String name;  //주소 변수 선언
		Scanner scan; //주소 변수 선언

		scan = new Scanner(System.in); //주소 변수 할당
		System.out.print("성명 : ");
		name = scan.nextLine(); //주소 변수 할당

		System.out.println("귀하의 이름은 " + name + "이군요.");
		
		
	}
}