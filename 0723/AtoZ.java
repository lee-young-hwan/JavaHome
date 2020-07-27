/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/



public class AtoZ{
	public static void main(String[] args) {

 	char Dae = 'A';                     // Dae 라는 문자를 'A'라고 선언
		
		
		

		int count = 1;

	for (int i = 1; i <= 26 ;i++)
	{

		System.out.print(Dae + "   ");

		Dae+=1;                             // Dae를 1부터 26까지 대문자로 출력
		
		


		if(count % 5 ==0)                   // 한줄에 5개씩 출력
				System.out.println();

		count++;                            // 1개 출력할 떄마다 카운트를 증가시킴
	} 

		




		
	}
}