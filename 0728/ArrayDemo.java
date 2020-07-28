/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class ArrayDemo{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] array; // 선언

		array = new int[4]; // 생성 (이미 각 방은 0 0 0 0으로 초기화되어있음)

		System.out.print("국어 :");
		array [0] = scan.nextInt();

		System.out.print("영어 :");
		array [1] = scan.nextInt();

		System.out.print("수학 :");
		array [2] = scan.nextInt();

		//sum = kor + eng + mat;
		//array [3] = array[0] + array[1] + array[2];
		
		for (int i = 0;i < array.length - 1 ;i++)  // array.length -1 = array[3]에서 -1 
		{
			array [3] += array [i];
		}
		System.out.printf("국어 = %d, 영어 = %d, 수학 = %d, 총점 = %d, 평균 = %.1f\n", array [0], array [1], array [2], array [3], array [3] / 3.);
	}
}