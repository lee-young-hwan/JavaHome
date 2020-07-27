/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class OpDemo1{
	public static void main(String[] args) {
		int su = 5;
		//System.out.printf("su = " + su++);
		int age = 24;
		//System.out.println("age = " + --age);

		int a = 5, b = 9;
		int result = ++a + b--;
		System.out.println("a = " + a); 
		System.out.println("b = " + b); 
        System.out.println("result = " + result); 
	}
}