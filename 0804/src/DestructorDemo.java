

public class DestructorDemo { // 생성자를 쓸 위치(부모클래스)
public static void main(String[] args) {
	Box box = new Box();
	box = null;
	System.gc();
}
}
class Box { // constructor, 소멸자를 쓸 위치 (자식클래스)
	public Box() {
		System.out.println("방금 객체가 생성됐습니다.");
	}
	protected void finalize() { // destructor(소멸자)
		System.out.println("방금 객체가 소멸됐습니다."); 		
	} 
}
