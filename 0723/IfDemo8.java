/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class IfDemo8{
	public static void main(String[] args) {
		
		double avg = 89.12345678;
		avg *= 100; //891.2345678;


		double result = Math.round(avg); // 891
		result /= 100;
		
		System.out.println("result = " + result);

		

	}
}