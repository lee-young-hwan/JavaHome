

// 메소드의 필수 3요소 : 이름 / 반환타입 / 괄호

public class HelloWorld6 {
public static void main(String[] args) {

	HelloWorld5 hw = new HelloWorld5();
	HelloWorld6.display();  // 클래스 메소드는 클래스의 이름으로 접근한다  
}
	static void display() // 메소드의 선언부 (이름), 멤버 메소드
	{
		System.out.println("Hello, World"); // 메소드의 구현부 (괄호)
	}
}

