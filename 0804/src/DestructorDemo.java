

public class DestructorDemo { // �����ڸ� �� ��ġ(�θ�Ŭ����)
public static void main(String[] args) {
	Box box = new Box();
	box = null;
	System.gc();
}
}
class Box { // constructor, �Ҹ��ڸ� �� ��ġ (�ڽ�Ŭ����)
	public Box() {
		System.out.println("��� ��ü�� �����ƽ��ϴ�.");
	}
	protected void finalize() { // destructor(�Ҹ���)
		System.out.println("��� ��ü�� �Ҹ�ƽ��ϴ�."); 		
	} 
}
