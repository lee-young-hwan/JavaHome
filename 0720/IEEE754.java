/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class IEEE754{
	public static void main(String[] args) {
		float original = 25.5f;
		int result = Float.floatToIntBits(original);
		System.out.printf("result = %x\n", result);

		double target = 25.5;
		long result1 = Double.doubleToRawLongBits(target);
		System.out.printf("result1 = %x\n", result1);
	}
}