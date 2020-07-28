/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class ProductMgmt{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Product [] array = new Product[2];

		for (int i = 0; i < array.length ;i++)
		{
			array[i] = new Product();              // new를 써야한다

			System.out.print("제품의 이름 : ");
			array[i].name = scan.next();

			System.out.print("제품의 가격 : ");
			array[i].price = scan.nextInt();

			System.out.print("제품의 수량 : ");
			array[i].quantity = scan.nextInt();
		}

		for ( Product p : array ) // p = array[0]
		{
			System.out.printf("이름 = %s, 가격 = %d, 수량 = %d\n", p.name, p.price, p.quantity);
		}

	}
}