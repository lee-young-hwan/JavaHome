/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ForDemo1{
	public static void main(String[] args) {
		
	/*	int i = 1; // 선언

		for(i = 1; i <= 10 ; ) // 초기값을 밖으로 뺄 수도 있다
		{
			System.out.printf("%5d", i);

			i++; // 증감식이 맨 마지막 순서이기 때문에 괄호안에 써도되고 밖에 써도된다

		}
		
		System.out.printf("\ni = " + i); // for를 벗어났기 때문에 i의 값을 찾을 수 없다 */



		// x는 1부터 100까지 3씩 증가하고, y는 100부터 2씩 감소한다.
		// 언젠가 x와 y는 교차될 것이다.
		// 교차될 때의 x와 y의 값은? (쉼표를 이용해 초기값을 같이쓴다) 


		int x,y; //선언		

		for(x = 1, y = 100; x < 101; x += 3, y -= 2) // x = 1부터시작, y = 100부터 시작
		{
			if (x > y)
			
				break; // x가 y보다 커지면 반복을 멈춘다
			

		}

		System.out.printf("x = %d, y = %d\n", x, y);

	}
}