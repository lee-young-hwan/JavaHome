

public class AssertionDemo {
	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 1; i < 101; i++) {
			sum = i;
		}
		//if (i > 100)
			//System.out.println("100�� �ݺ� ���� Ȯ���� ��");
		assert i > 100 : "100�� �ݺ� ���� Ȯ���� ��"; 
		assert sum > 100 : "���� �˻� �ʿ� ";
		System.out.println("sum = " + sum);
	}
}
