/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class CastingExample {
	public static void main(String[] args) {	
		/*int intValue = 44032;        // 정수가 문자로 바뀜
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;   // 정수를 제외한 나머지는 버림
		intValue = (int) doubleValue;
		System.out.println(intValue);*/

		// int age = (int)24L;
		byte age = 24;             // 
		double avg = 89;           // avg = 89.0

		age = (byte)avg;           // avg = 89

		byte a = 5;
		byte b = 9;
		byte sum = a + b;          // Java는 +연산자를 하면 이유를 불문하고 Int가 된다. 따라서 4Byte로 타입이 다르기 때문에 에러가 난다 (-,*,/도 마찬가지)
	} 
}