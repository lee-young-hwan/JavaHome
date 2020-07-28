/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ArrayDemo7{
	public static void main(String[] args) {
		
	Car [] array = null; //선언

	array = new Car[2];  //생성
	array[0] = new Car();
	array[0].name = "Sonata";
	array[0].maker= "Hyundai";
	array[0].price= 25_000_000;

	

	
	
	
	array[1] = new Car();
	array[1].name = "Carnival";
	array[1].maker = "KIA";
	array[1].price = 30_000_000;

	for (int i = 0; i <array.length ;i++)
	{
		System.out.printf("%s, %s, %d\n", array[i].name, array[i].maker, array[i].price);
	}


	}
}