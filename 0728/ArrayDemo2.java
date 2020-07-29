/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Arrays;

public class ArrayDemo2{
	public static void main(String[] args) {
		int [] array = {10, 20, 30, 40, 50};

	/* 첫번째 방법 (인덱싱이 필요할때)
		for (int i = 0;i < array.length ;i++)
		{
			System.out.printf("%5d", array[i]);
		}*/


	/*  두번째 방법
		for (int su : array)
		{
			System.out.printf("%5d", su);
		}*/

		System.out.println(Arrays.toString(array)); 



	}
}