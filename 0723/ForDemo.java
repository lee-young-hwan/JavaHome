/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ForDemo{
	public static void main(String[] args) {

		//int sum = 0;

		long result = 1;

		for (int i = 1; i <= 100; i++){			
			//System.out.print(a + "   "); // for의 조건이 참일 경우 해야할 작업
			//sum = sum + a; // 1 + 2 + ... + 9 + 10
			if(i % 5 == 0)
				System.out.print(i + "   ");
				//count++; // count가 3이면 줄바꿈됨

			
		}
		//System.out.println("합은 " + sum);
		//System.out.println("5의 배수는 " + result);
	}
}