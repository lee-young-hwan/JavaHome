/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ArrayDemo{
	public static void main(String[] args) {
		
	// 첫번째 방법

	/*	// 1.선언(값변수)
		int su; 
		int [] array; // 주소변수

		// 2.생성
		array = new int[4];

		// 3.할당
		su = 5;
		array[0] = 3; array[1] = 4; array[2] = 5; array[3] = 6;     // 3,4,5,6 이라는 집합체를 array가 가리키고 있다 (heap에 저장)*/

		

	// 두번째 방법

	/*	// 1.선언
		int [] array;

		// 2.생성&할당
		array = new int[]{3,4,5,6};    // 주의 : [] 안에 개수를 쓰면 안됌*/



	// 세번째 방법

		// 1.선언, 생성 & 할당
		int [] array = {3,4,5,6};  // 선언과 할당을 같은 줄에 입력해야한다. 선언과 할당이 다른줄이면 무조건 에러가 난다  같은 구조,성질,크기여야만 한다
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		//System.out.println(array[2]);
		//System.out.println(array[3]);

		array[0] = array[0] * 100; // write

		for (int i = 0;i < 4 ;i++)
		{
			System.out.println(array[i]); // read            
		}

	}
}