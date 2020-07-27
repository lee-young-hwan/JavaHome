/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class OpDemo8 {
	public static void main(String[] args) {
		//3항 연산자 사용시 주의할 점 = (true)같은 조건부를 먼저 보지 말고  참 : 거짓 먼저 데이터타입이 맞는지 확인한다
		double result = (true) ? 9 : 9.5; // 컴파일러는 (9 : 9.5 <- 참 : 거짓) 부터 보기 때문에 int가 9.5를 받을 수 없어 에러가 난다 
		System.out.println("result = " + result);
	}
}