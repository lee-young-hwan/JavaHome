/*
 * 1. this   -> 나의, 명시적으로 멤버변수나 멤버메소드를 지칭할때 사용
 * 2. this   -> 나의 또 다른 주소, return this / (this)
 * 3. this() -> new 없이 생성자에서 또 다른 생성자를 호출하기
 */

public class ThisDemo2 {
	public static void main(String[] args) {
		Student chulsu = new Student("한지민", 25);
		chulsu.print();
	}
}

