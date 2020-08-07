/*
 * instanceof의 용법
 * 1. 부모형의 참조변수를 자식 클래스(원형)을 알고자 할 때
 *2. 부모형이 자식형으로 강제형변환 여부를 판단하고 할 때
*/


public class CarCenter {
	public static void main(String[] args) {
		
		CarCenter cc = new CarCenter();
		
		Sonata sonata = new Sonata("Silver Sonata");
		//cc.repair(sonata);
		
		Carnival carnival = new Carnival("White Carnival");
		cc.repair(carnival);
		
		Matiz matiz = new Matiz("Red Matiz");
     	//cc.repair(matiz);
	}
	
	void repair(Car car) {  // 멤버 변수
		//System.out.println(car + "이(가) 잘 수리됐습니다."); // Polymorphic Parameter, 자식이 부모형으로 형변환 가능한 다형성
		if (car instanceof Matiz) System.out.println("마티즈 수리 완료");
		else if (car instanceof Sonata) System.out.println("소나타 수리 완료");
		else if (car instanceof Carnival) System.out.println("카니발 수리 완료");
	}
}
