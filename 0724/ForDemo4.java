/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ForDemo4{                                               // 인덱스를 사용하지 않는 것이 향상된 for문 = 속도향상
	public static void main(String[] args) {
		String [] fruits = {"사과", "딸기", "포도", "수박", "복숭아"}; 

		//for(int i = 0; i <=4; i++)
		//{
		//	System.out.println("fruits[" + i + "] = " + fruits[i]);
		//}

		for( String myvalue : fruits ) // (  : 배열 또는 컬렉션 반복)
		{
			System.out.println(myvalue); // 처음부터 끝까지 값을 다 출력 
		}

	}
}