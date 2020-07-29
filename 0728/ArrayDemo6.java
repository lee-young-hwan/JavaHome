/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ArrayDemo6{
	public static void main(String[] args) {

		String str = "서울시 강남구 역삼동";
		char [] array = str.toCharArray();
		
		for (int i =0; i < array.length ;i++)
		{
			System.out.printf("%3c", array[i]);
		}

		array[0] = '경';  array[1] = '기'; array[2] = '도';
		System.out.println();

		str = new String(array); // 값을 바꾸려면 new를 사용해야한다

		
		for (int i =0; i < array.length ;i++)
		{
			System.out.printf("%c", array[i]);
		}


		

		
		
	}
} 