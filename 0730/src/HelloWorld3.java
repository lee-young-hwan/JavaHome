
public class HelloWorld3 {
public static void main(String[] args) {
	
	Test t = new Test();
	System.out.println(t.str);
} 
}

class Test{
	String str = "Hello, World";  // 멤버 변수는 항상 주소로 접근
	}
