/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class Money{
	public static void main(String[] args) {
		int mon = 10000;
		int sangpum = 5300;

		System.out.println("상품 금액을 입력하세요 : " + sangpum);

		System.out.println("받은 돈을 입력하세요 : " + mon);

		System.out.printf("거스름돈은 %d원입니다.\n", mon - sangpum); 

		
	}
}