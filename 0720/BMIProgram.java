/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class BMIProgram{
	public static void main(String[] args) {
		
	Scanner	scan = new Scanner(System.in);
	double ki;
	double weight;
	double BMI;

	System.out.print("키를 입력하세요 :");
    ki = scan.nextDouble();


    System.out.print("몸무게를 입력하세요 :");
    weight = scan.nextDouble();

    BMI = weight / (ki / 100 * 2);
		
	System.out.printf("귀하의 BMI지수는 %.2f입니다.", BMI);



	}
}