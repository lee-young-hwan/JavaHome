/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class ArrayDemo2{
	public static void main(String[] args) {   // args : arguments

		System.out.println("배열의 개수 : " + args.length);

		Scanner scan = new Scanner(System.in);

		float [] array = new float[3];

		for (int i = 0; i < array.length ;i++)   // 배열의 길이 = 배열의 개수, 배열의 이름.length 
		{
			System.out.print(">> : ");
			array[i] = scan.nextFloat();
		}

		float min = array[0], max = array[0]; // 선언 (항상 0번째 방을 기준으로 비교한다)

		for (int i =0;i < array.length ;i++)
		{
			if (min > array[i])
			{
				min = array[i];
			}

			if (max < array[i])
			{
				max = array[i];
			}
		}
		System.out.println("가장 큰 값 = " + max);
		System.out.println("가장 작은값 = " + min);
		
	}
} 