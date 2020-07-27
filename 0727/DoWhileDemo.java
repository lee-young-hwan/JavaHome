/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class DoWhileDemo{
	public static void main(String[] args) {                   // 6개의 랜덤숫자 나오게 하기

		int rand1,rand2, rand3, rand4, rand5, rand6;

		do{
		
			rand1 = (int)(Math.random() * 45 + 1);
			rand2 = (int)(Math.random() * 45 + 1);
			rand3 = (int)(Math.random() * 45 + 1);
			rand4 = (int)(Math.random() * 45 + 1);
			rand5 = (int)(Math.random() * 45 + 1);
			rand6 = (int)(Math.random() * 45 + 1);

		  }while (rand1 == rand2 || rand1 == rand3 || rand1 == rand4 || rand1 == rand5 || rand1 == rand6 ||
			  rand2 == rand3 || rand2 == rand4 || rand2 == rand5 || rand2 == rand6 ||
			  rand3 == rand4 || rand3 == rand5 || rand3 == rand6 ||
			  rand4 == rand5 || rand4 == rand6 ||
			  rand5 == rand6);

		System.out.println(rand1 + " , " + rand2 + " , " + rand3 + " , " + rand4 + " , " + rand5 + " , " + rand6);


		



	}
}

