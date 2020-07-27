/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class OpDemo5{
	public static void main(String[] args) {
		//단항 연산자 사용시 주의할 점 : +, -, ~ 의 결과는 무조건 int다 
		//byte a = 5;
		//int result = ~a;
		//int result = -a;
		//System.out.println("result = " + result);

		//이항연산(산술,이동,관계,비트,논리)의 결과는 무조건 int 이상
		//byte + byte --> int, byte + short --> int, short * short --> int

		//byte a = 5;
		//byte b = 9;
		//byte sum = a & b; // +는 이항연산자기 때문에 무조건 int 이상이다, 시프트연산자도 마찬가지

		int a = 5, b = 9, x = 100;
		if(a < x | ++b > 20){              // && = 앞의 식(a<x)이 거짓이면 뒤에 식(++b>20)은 컴퓨터가 아예 계산하지 않음  
			System.out.println("참");      //   & = 앞의 식(a<x)이 거짓이라도 뒤에 식(++b>20)까지 마저 계산함
		}

		else{
			System.out.println("거짓");
		}

		System.out.println("b = " + b);

	}
}