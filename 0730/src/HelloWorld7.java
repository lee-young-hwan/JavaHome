

public class HelloWorld7 {
public static void main(String[] args) {
	Demo d = new Demo();
	d.display();
}
}

class Demo{
	void display() { // 멤버 변수, 인스턴스 함수
		System.out.println("Hello, World");
	}
}