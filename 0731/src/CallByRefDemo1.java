import java.util.Arrays;
import java.util.Scanner;

public class CallByRefDemo1 {
	public static void main(String[] args) {
		int [] array = input();
		output(array);
	}
	static int [] input(){            // �迭�� ����, ������ ��ȯŸ��, �ּҾ��� ������ static�� ����
		Scanner scan = new Scanner(System.in);
		int [] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.print("���� >>"); array[i] = scan.nextInt(); 
		}
		return array;
	}  
	static void output(int [] array){ // �迭�� ���, �ּҾ��� ������ static�� ����
		System.out.println(Arrays.toString(array));
	} 
}
