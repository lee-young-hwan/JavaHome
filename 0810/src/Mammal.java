/*
 *  추상클래스의 목적 : 다형성의 강제화(선언형=부모, 실제형=자식)
 *  추상메소드의 목적 : Override의 강제화
 *  abstract와 final은 같이 쓸 수 없다
 *  abstract는 자식을 무조건 만들어야함
 *  추상클래스는 반드시 자식에 의해서만 구현된다
 *  강제 재정의 = 부모메소드를 추상메소드로 정의
 */

public abstract class Mammal { 
	public String name;
	public Mammal(String name) {
		this.name = name;
	}
	
	public abstract void print(); // 선언
}

class Lion extends Mammal{
	public Lion(String name) {
		super(name);
	}
	
	@Override
	public void print() {
		System.out.println("나는 자식의 메소드");
	}
	
}
