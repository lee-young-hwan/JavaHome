/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class OpDemo{
	public static void main(String[] args) {
		int su = -128;
		int result = ~su; // ~는 숫자형일때 사용
		
		boolean flag = true;
		boolean answer = !flag;

		System.out.printf("su = %d, result = %s\n", su, Integer.toBinaryString(su));

		System.out.printf("result = %d, result = %s\n", result, Integer.toBinaryString(result));
	}
}