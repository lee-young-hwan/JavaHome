/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ValueCopyTest{
	public static void main(String[] args) {
		/*int first, second;
		first = 7;
		second = first;
		System.out.println("first = " + first);
		System.out.println("second = " + second);

		System.out.println("값 변환 후");
		second = 10;
		System.out.println("first = " + first);
		System.out.println("second = " + second);*/

		double original = 173.6;
		double copy = original; //복사 (type으로 기본인지 참조인지 구분)
		System.out.printf("original = %.1f, copy = %.1f\n", original, copy);

		original = 190.4;
		System.out.printf("original = %.1f, copy = %.1f\n", original, copy);

		/*
			값복사
			1. 대상 : primitive type (기본형의 8가지 type)
			2. 동작 : 원본이 바뀐다고 Copy본이 바뀌지 않는다. 즉, 원본과 Copy본은 서로 다르다

		*/


	}
}