
// ������� �ʱ�ȭ = ������
// Ŭ�������� �ʱ�ȭ = Ŭ���� �ʱ�ȭ ���
public class InstanceInitializationBlock {
public static void main(String[] args) {
	Car car = new Car(); car.print();
}
}
class Car{
	// private String name = "�ҳ�Ÿ"; // ����� �ʱ�ȭ
	private String name;
	{
		System.out.println("���� �ʱ�ȭ ���"); 
		this.name = "ī�Ϲ�";
	}
	
	public Car() {
		System.out.println("���� �������Դϴ�.");
		this.name = "�ҳ�Ÿ";
	}
	
	public void print() {
		System.out.println("name = " + this.name);
	}
}