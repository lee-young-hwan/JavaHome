/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ParseDemo{
	public static void main(String[] args) {
		/*String str = "128"; 
		int su = Integer.parseInt(str, 16);  // 16진법   parseInt : 숫자형 글자를 숫자로 변환
		System.out.printf("su = %x\n" + su);*/


		int su = 128;
		// String str = "" + su;                 // 첫번째 방법  "128" (글자 128)

		// String str = String.valueOf(su);      // 두번째 방법 (글자 128)

		String str = Integer.toString(su, 16);   // 세번째 방법 (글자 128), su를 16진수로 바꾸라는 뜻
		System.out.printf("str = %s\n", str);



	}
}