/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Arrays;

public class BubbleSorting{
	public static void main(String[] args) {

		//내림차순 

		int [] array = {5,8,2,1,4,6,2,3,7,9};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length - 1 ;i++)
		{
			for (int j = 0 ;j < array.length - 1 ;j++) // 
			{
				if (array[j] < array[j+1]) // 0번째 < 1번째이면 자리를 바꾼다, 이걸로 내림차순/오름차순이 정해짐
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(array));

	}
}