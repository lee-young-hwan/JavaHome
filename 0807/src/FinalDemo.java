/*
 *  Constant 상수
 *  1. 지역상수
 *  2. 멤버상수
 *  3. 클래스상수
 */

public class FinalDemo {
	int age;    // 멤버변수
	final double PI; // 멤버상수
	static int kor; // static변수
	static final int ENG; // static상수
	static{ // static 초기화 블록
		kor = 90; // static variable 초기화
		ENG = 100; // static constant 초기화
	}
		
	public FinalDemo() { // 생성자(멤버가 붙으면 전부 생성자필요)
		this.age = 24;   // 멤버변수 초기화
		this.PI = 3.14;  // 멤버상수 초기화
	}
	
	public static void main(String[] args) {
		final String NAME = "한지민"; // 지역상수
		//NAME = "김지민";
	}
}
