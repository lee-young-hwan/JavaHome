

public class ArrayEx01 {
	public static void main(String[] args) {
		
		// score�� ���������̴�. int[]
		int [] score = null;
		
		// �浵 ������ �ʾҴµ�, ���� �����ϰ��ִ� (��������)
		// score = {100, 29};
		// score�� 5���� ���� �����ٰ� �����ϰ� �ִ�. (20Byte)
		score = new int[5];
		
		// �迭���� �� �ּҴ�
		System.out.println("score�� �ּҰ� : " + score);
		
		
		
		System.out.println();
		
		// score[0]�� ������ ����
		// score�� �ּҰ� [] �ȿ� ���� ���ڰ� �ε���(÷��)��� �Ѵ�
		score[0] = 100;
		
		// �迭���ٰ� ���� ���Խ�Ű�� �ִ� ����
		for (int i =0; i <score.length; i++) {
			score[i] = i + 10;
		}
		
		// �迭�� ������ �濡 �ִ� ���� ����ϴ� ����
		for (int i =0; i <score.length; i++) {
			System.out.println("score[" + i + "] =" + score[i]);
		}
		
		
		
		
	}
}
