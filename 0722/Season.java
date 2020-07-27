/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class Season{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("좋아하는 계절(spring/summer/fall/winter) :" );

		String 계절 = scan.nextLine(); //summer를 입력받을 변수
		
		System.out.println("계절 : " + 계절);

		String 꽃;

		String 꽃 = "꽃 : " + (계절.equals("spring")) ? "개나리, 진달래" :
			                        (계절.equals("summer")) ? "장미, 아카시아" :
			                        (계절.equals("fall")) ? "백합, 코스모스" : "동백, 매화";

		System.out.println("꽃 : " + flower);
			                        





		
	}
}