

public class ArrayEx02 {
	public static void main(String[] args) {
		
		int sum = 0;  // ����
		double avg = 0.0; // ���
		
		int [] score = new int[] {100,90,80, 50, 70}; // ����� ���ÿ� �ʱ�ȭ
		
		System.out.println("�迭�� ũ�� : " + score.length);
		
		// �迭�� ��
		for (int i =0; i < score.length; i++) {
			sum += score[i];
		}
		
		// ���
		avg = sum / score.length;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
	}
}
