

public class VariableArgumentsDemo {
public static void main(String[] args) {
	print(1, 'A', true, 89.5);            // �迭�� �迭�϶��� ����������
}
	static void print(Object ... array) { // �Է��� �迭�� �ƴѵ� ����� �迭�� �Ϸ���  = int ... arrayó��  (...) ��ȣ�� ���� (��������)
		                                  // ��� ��ü�� �θ� : (Object)   
		System.out.println("length = " + array.length);
	}
}
