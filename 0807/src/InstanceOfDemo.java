

public class InstanceOfDemo {
	public static void main(String[] args) {
		//Mammal m = new Mammal();  // �θ���
		Korean ko = new Korean(); // �ڽ���
		// "�ѱ����� �������̴�." 
		//m = (Mammal)ko; // �ڽ��� �θ������� ��ȯ�ϴ� ���� ������ ����
		
		// "�������� �ѱ����̴�."
		//ko = (Korean)m;  // m = (Mammal)ko; ������ ���� ������ ����������
		
		Object obj = new Object(); // �θ�
		String str = new String(); // �ڽ�
		
		obj = str;
		//str = (String)obj; 
		
		if (obj instanceof String) System.out.println("����ȯ ����"); // ( �������� instanceof(���迬����) ������Ÿ�� )
		else System.out.println("����ȯ �Ұ���"); 
	}
}
