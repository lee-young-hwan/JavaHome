
public class SecondArrayEx01 {
	public static void main(String[] args) {

		// 2���� �迭�� ����� ���ÿ� �ʱ�ȭ�ϰ� ����
		int[][] score = new int[][] { { 100, 100, 100 }, { 50, 50, 50 }, { 10, 20, 30 }, { 60, 20, 40 } };

		// 2���� �迭�� ���� �а� ���� ���ؼ��� ��������� �ݵ�� �ʿ��ϴ�
		
		for (int i =0; i <score.length; i++) {
			for(int j =0; j < score[i].length; j++) {  // 2���� �迭���� j���� �ּҰ�
				System.out.println(score[i][j]); 
			}
		}
		
		System.out.println("2���� �迭�� ũ�� : " + score.length);
		System.out.println("2���� �迭�� �ּ� : " + score);
		
		for(int i =0; i < score.length; i++) {
			System.out.println("1���� �迭�� ũ�� : " + score[i].length);
			System.out.println("1���� �迭�� �ּ� : " + score[i]);
		}

	}

}
