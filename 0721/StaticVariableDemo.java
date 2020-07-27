/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

/*
	클래스변수 : static variable
	 -클래스의 이름으로 접근한다
	 Integer.MAX_VALUE, Short.MAX_VALUE, Byte.MAX_VALUE
	 -소속 클래스의 주소를 생성할 필요가 없다
	 -자동으로 DataType에 맞춰 초기값이 주어진다. (False가 초기값)
	 -정수형 : 0
	 -실수형 : 0.0
	 -Boolean : false
	 -문자형 : '\0', '\u0000'(NULL값)
	 -참조형 : null(NULL번지)
*/

public class StaticVariableDemo{

	static int age; // Class Variable, static Variable

	public static void main(String[] args) {
		
		// int age; // 지역변수

	/*	System.out.println("나이 = " + age);
		System.out.println("나이 = " + StaticVariableDemo.age);
		StaticVariableDemo svd = new StaticVariableDemo(); // svd = 주소변수
		System.out.println("나이 = " + svd.age);*/
		
		Product.price = 25_000_000;
		System.out.println("가격은 = " + Product.price);
	}
}

class Product
{
	static int price; //클래스 변수
}