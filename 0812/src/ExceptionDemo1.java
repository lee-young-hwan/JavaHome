import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ �Է� : ");
		
		try {
			int kor = scan.nextInt();
			if (kor < 0 || kor > 100) throw new  // throw : ���ܸ� ó���Ѵ�
			RuntimeException("���������� 0���� 100�� ���̿��� �մϴ�");
		
		System.out.println("kor = " + kor);
		} catch(RuntimeException ex) {
			//JOptionPane.showMessageDialog(null, ex.getMessage());
			System.out.println(ex.getMessage());
		}
		
		
	}
}
