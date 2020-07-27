/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

/*
 Class : Modeling이 가능한 모든 대상 (빵틀)
 Object : 
 Instance : (빵)

 메모리의 주소 Byte = 4Byte
 모든 Reference는 항상 4Byte다
*/

public class ReferenceDemo{
	public static void main(String[] args) {
		Car sonata; // 선언 Car DataType, 참조형(class,interface,enum)이기 때문에 값이 아닌 주소를 저장
		int age;
		
		age = 24;   // 할당
		sonata = new Car();          //객체 생성, new를 통해 메모리의 절대번지를 sonata에 넣어준다
		sonata.name = "소나타";        //할당, sonata에 속해있는 이름
		sonata.price = 25_000_000;     //할당, sonata에 속해있는 가격
		sonata.maker = "현대자동차";    //sonata에 속해있는 메이커

		

		Car carnival = new Car();   //생성
		carnival.name = "카니발";     //할당
		carnival.price = 35_000_000; 
		carnival.maker = "기아자동차";

		System.out.printf("이름 = %s, 가격 = %d, 제조사 = %s\n", sonata.name, sonata.price, sonata.maker);

		System.out.printf("이름 = %s, 가격 = %d, 제조사 = %s\n", carnival.name, carnival.price, carnival.maker);

	}
}

class Car{
	String name;
	int price;
	String maker;
}