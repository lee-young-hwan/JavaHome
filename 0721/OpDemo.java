/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class OpDemo{
	public static void main(String[] args) {            // , [] () = 최우선 연산자!
	// ,(~의, ~에 속해있는)  []  ()
	System.out.println("4 + 5 * 6 = " + ((4 + 5) * 6)); // ()연산자
	String [] fruits = { "사과", "배", "딸기", "복숭아" };     // String은 변수 1개씩만 선언해야하기 때문에 '[]'라는 배열이라고 선언한다(그룹)
	System.out.println(fruits[2]);                      // 대괄호'[]'는 배열일 때 쓴다
	System.out.println("255의 이진수는 = " + Integer.toBinaryString(255)); // static = 클래스이름

	}
}