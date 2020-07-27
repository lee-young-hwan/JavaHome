/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class OpDemo4{
	public static void main(String[] args) {
		//int a = 5;
		//int b = 7;
		//boolean a = true;
		//boolean b = false;

		//System.out.printf(" a == b == > %b\n", (a==b)); // 기본형은 값을 비교
		//System.out.printf(" a == b == > %b\n", (a!=b));

		String name = new String("한지민"); //String = 주소를 비교             
		//.out.printf("한지민 == name ==> %b\n", ("한지민" == name));
		System.out.printf("한지민 == name ==> %b\n", ("한지민".equals(name))); // 값을 비교할 때는 equals 사용
		//문자열의 값 비교는 == 연산자가 아니라 equals() 메소드 사용, new를 쓰거나 안쓰거나 주소가 아닌 값을 비교해줌
		System.out.printf("한지민 == name ==> %d\n", ("한지민".compareTo(name))); // 한지만이라고 적었을 때 한지민-한지만의 차이값(유니코드)이 560인 것
		//문자열은 주소를 비교한다. 값은 비교하지않음!

	}
}