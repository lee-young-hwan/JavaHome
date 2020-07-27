/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;
public class cmProgram{
	public static void main(String[] args) {

		
		Scanner scan  = new Scanner(System.in);

		int k;
		double pit;
		double inchi;


		System.out.print("키 :");
		k = scan.nextInt();


		inchi = k / 2.54;
		pit = inchi / 12;
		
		


		System.out.printf("pit= %.2f\n", pit);
		System.out.printf("inchi= %.2f\n", inchi);

		



	}
}