

public class Jasik extends Bumo{
	private int age;

	public Jasik(String name, int age) {
		super(name);
		this.age = age;
	}

	@Override
	public String toString() {
		//return "Jasik [age=" + age + "]";
		return super.toString(); // �θ��� �ּҷ� ���
	}
	
	@Override
	public void print() {
		System.out.println("���� �ڽ� �޼ҵ�");
	}
	
	public void display() { // �����ǰ� ���� �ʾƼ� ������ ���� ����
		                    // Bumo �޼ҵ忡 display�� ���� �����̴�
		System.out.println("���� �ڽ��� �Ϲ� �޼ҵ�");
	}
}
