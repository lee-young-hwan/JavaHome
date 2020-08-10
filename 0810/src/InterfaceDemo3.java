// Flag interface : 기능은 없고 표시만 하는 인터페이스

public class InterfaceDemo3 {
	public static void main(String[] args) {
		Demo d = new Demo(24);
		//Demo other = d; // 주소복사
		Demo other = (Demo)d.copy();
		// d.clone();
	}
}

class Demo extends Object implements Cloneable{  // implements Cloneable : 복제가 가능해짐
	public int age;

	public Demo(int age) {
		this.age = age;
	}

	public Object copy() {
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("복제에 실패했습니다.");
		}
		return obj;
	}
}