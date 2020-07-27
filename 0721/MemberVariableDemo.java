/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

/*
	Meber variable : Instance variable
	-자동으로 변수의 초기값은 주어진다 (class 변수와 같다)
	-멤버변수는 주소로 접근한다
*/

public class MemberVariableDemo{
	
	//static int age; //클래스변수
	int age;        // 멤버변수, 지역변수는 멤버변수에 붙여야 한다 (공유가 되지 않는다)

	public static void main(String[] args) {
		//int age;    // 지역변수, 지역변수는 절대로 static을 붙일 수 없다
		
		MemberVariableDemo mvd = new MemberVariableDemo();

		System.out.println("나이 = " + mvd.age);
	}
}