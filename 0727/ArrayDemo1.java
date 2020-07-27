/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

/*
	배열의 초기화
	1. 정수 -> byte, short, int, log : 0으로 초기화
	2. 실수 -> float, double : 0.0으로 초기화
	3. Boolean -> false로 초기화
	4. 문자 -> char : 널값, '\0', '\u0000' 
	5. 참조형 -> 주소 : 널번지, null
*/

public class ArrayDemo1{
	public static void main(String[] args) {
		String [] array = new String[4];

		for (int i = 0;i < 4 ;i++)
		{
			System.out.printf("array[%d] = %s\n", i, array[i]);
		}
	}
}