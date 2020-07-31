
// 1. static 메소드는 member 메소드를 호출할 수 없다. (주소가 없어서)
// 2. member 메소드는 static 메소드를 호출할 수 있다. (한참 전에 올라와서)

public class MethodDemo {
public static void main(String[] args) {
	//print();
}
 void print() {
	 //System.out.println("Hello, World");
	 display();
 }
 void display() {
	 
 }
}
// java MethodDemo