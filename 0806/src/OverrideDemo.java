import java.util.Date;

public class OverrideDemo {
	public static void main(String[] args) {
		Integer in = new Integer(100);
		System.out.println(in.toString());
		System.out.println(in);
		
		Demo d = new Demo();
		System.out.println(d.toString());
		System.out.println(d);
		
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now);
	}
}

class Demo extends Object{
	String name = "������";
	@Override // �ǵ������� �������Ѵٴ� ��
	public String toString() {
		//return "�̸��� " + this.name + "�Դϴ�.";
		return String.format("�̸��� %s �Դϴ�.%n", this.name);  // (����,���)
	}
}