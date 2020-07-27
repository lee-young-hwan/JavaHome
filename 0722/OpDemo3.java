/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class OpDemo3{
	public static void main(String[] args) {
		int su = -128;
		int result = su >> 5;
		int result1 = su >>> 5;

		System.out.println("su = " + Integer.toBinaryString(su));
		System.out.println("result = " + Integer.toBinaryString(result));
		System.out.println("result1 = " + Integer.toBinaryString(result1));

		System.out.println("result = " + result);
		System.out.println("result1 = " + result1);
	}
}