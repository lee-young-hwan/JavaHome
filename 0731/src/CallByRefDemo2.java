import java.util.Arrays;
import java.util.Scanner;

public class CallByRefDemo2 {
	public static void main(String[] args) {
		int [] array = new int[1000];
		int su = input(array);
		output(array, su);
	}
	static int input(int [] array){            // �迭�� ����, �������� ��ȯŸ���� �ƴϴ١�, �ּҾ��� ������ static�� ����
		Scanner scan = new Scanner(System.in);
		int su = 0;
		int i = 0;
		System.out.println("���� �Է�(0�� ����)");
		while((su = scan.nextInt()) != 0 && i < 1000) { // ���� �Է��� �޾Ҵµ� su�� 0�� �ƴϸ� ��
			array[i++] = su;
		}		
		return i;
	}  
	static void output(int[] array, int su){ // �迭�� ���, �ּҾ��� ������ static�� ����
		for (int i = 0; i < su; i++) {
			System.out.print(array[i] + "\t");
		}
	} 
}
