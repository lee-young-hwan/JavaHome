/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ArrayDemo5{
	public static void main(String[] args) {
		String [] array = new String[]{new String("한지민"), new String("서울시 강남구 역삼동"), new String("Oracle"), new String("970111-1234567")};

		for (int i = 0; i < array.length ;i++) 
		{
			System.out.printf("array[%d] = %s%n", i, array[i]); // 주소
		}


	}
}