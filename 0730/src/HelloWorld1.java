

public class HelloWorld1 {
	String str = "Hello, World";    // 멤버 변수
public static void main(String[] args) {
	HelloWorld1 hw = new HelloWorld1();
	System.out.println(hw.str);     // 멤버 변수는 반드시 주소로 접근해야한다
}
}
