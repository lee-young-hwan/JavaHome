/*
 * instanceof�� ���
 * 1. �θ����� ���������� �ڽ� Ŭ����(����)�� �˰��� �� ��
 *2. �θ����� �ڽ������� ��������ȯ ���θ� �Ǵ��ϰ� �� ��
*/


public class CarCenter {
	public static void main(String[] args) {
		
		CarCenter cc = new CarCenter();
		
		Sonata sonata = new Sonata("Silver Sonata");
		//cc.repair(sonata);
		
		Carnival carnival = new Carnival("White Carnival");
		cc.repair(carnival);
		
		Matiz matiz = new Matiz("Red Matiz");
     	//cc.repair(matiz);
	}
	
	void repair(Car car) {  // ��� ����
		//System.out.println(car + "��(��) �� �����ƽ��ϴ�."); // Polymorphic Parameter, �ڽ��� �θ������� ����ȯ ������ ������
		if (car instanceof Matiz) System.out.println("��Ƽ�� ���� �Ϸ�");
		else if (car instanceof Sonata) System.out.println("�ҳ�Ÿ ���� �Ϸ�");
		else if (car instanceof Carnival) System.out.println("ī�Ϲ� ���� �Ϸ�");
	}
}
