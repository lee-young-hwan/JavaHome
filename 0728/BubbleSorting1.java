/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner; //입력받을때
import java.util.Arrays;  //출력받을때

public class BubbleSorting1{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int [] array = new int[1000];
		
		System.out.println("정수를 입력하세요. 단 0은 종료");

		int idx = 0;

		while (true)
		{
			int su = scan.nextInt();
			
			if (su == 0)
			
				break;
				
			
			array[idx++] = su;  // su = 0이 아니라면
		
			System.out.println("Before Sorting");

			for (int i = 0; i < idx ;i++)
			{
				System.out.printf("%d\n", array[i]);
			}


			// 오름차순

			for (int i = 0;i < idx - 1 ;i++)
			{
				for (int j = 0;j < idx - 1 ;j++)
				{
					if (array[j] > array[j+1])
					{
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}

			

			}

			System.out.println("After Sorting");

			for (int i = 0; i < idx ;i++)
			{
				System.out.printf("%d\n", array[i]);
			}


		}
		
	}
}