

public class ArrayEx03 {
	public static void main(String[] args) {
		
		// 40����Ʈ
		int [] arr1 = new int[10];
		
		// arr1 �迭�� ������ 10�� �����ϰ� �ִ�.
		for(int i =0; i < arr1.length; i++) {
			
			// ���� : 1~10�� ����
			arr1[i] = (int)(Math.random() * 10) + 1;
		}
		
		// �迭�� ������ ����ϴ� �ڵ�
		for(int i =0; i < arr1.length; i++) {
			
			if(i == 9) {
			System.out.print(arr1[i]);
		}
		
		else {
			System.out.print(arr1[i] + ", ");
		}
			
		}
	}
}
	

