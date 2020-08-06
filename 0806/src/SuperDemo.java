/*
 * this의 용법
 * 1. this. : 나의, 나의 멤버변수와 멤버 메소드를 명시적으로 지칭하고자 할 때
 * 2. this
 * 3. this()
 * 
 * super의 용법
 * 1. super : 부모의, 부모의 (멤버변수)와 멤버메소드를 명시적으로 지칭하고자 할 때
 * 2. super()
 * 
 */

public class SuperDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();    //System.out.println(jasik.name);
	}
}

class Bumo{
	String name = "한지민";
	protected void print() {
		
	}
}

class Jasik extends Bumo{
	int name = 100;
	@Override // 의도적으로 코딩할때 사용
	public void print() {
		System.out.println("자식의 메소드");
	}
}