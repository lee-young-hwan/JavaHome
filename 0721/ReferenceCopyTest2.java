/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ReferenceCopyTest2{
	public static void main(String[] args) {
												// String은 예외로 참조형이지만 주소복사가 되지 않는다
		String original = "Hello";				// original = 변수, Hello = 상수
		String copy = original;
		System.out.printf("original = %s, copy = %s\n", original, copy);

		original = "World";
        System.out.printf("original = %s, copy = %s\n", original, copy);

		
	}
}