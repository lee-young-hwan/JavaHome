import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(4/0); // ArithmeticException�� instance ���� -> throw
		} catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException | ClassCastException ex) {  // �θ�,�ڽ��� Exception�� ���� ��������
			System.out.println(ex.toString());
		 

//		File file = new File("C:/temp/data3523525325235235.txt");
//		try {
//			Scanner scan = new Scanner(file); // FileNotFoundException�� instance�� throw
//		} catch (Exception ex) { // Exception ex = new FileNotFoundException(); 
//			
//			System.out.println(ex.getMessage());   // 1. ex.getMessage() : ������ �޽����� ������
//			
//			JOptionPane.showMessageDialog(null, ex.getMessage());  // ȭ�鿡 ������ �� �޽���â�� �����
//			
//			System.out.println(ex); // 2. ex.toString() : �޽����� Ÿ���� ���� ������
//			ex.printStackTrace(); // 3. ex.printStackTrace : ���° ���ο��� ������ ������ ���� �ڼ��ϰ� ������
			
//			if (ex instanceof NullPointerException) {
//				System.out.println("NullPointerException");
//			} else if (ex instanceof ArithmeticException) {
//				System.out.println("ArithmeticException");
//			} else if (ex instanceof FileNotFoundException) {
//				System.out.println("FileNotFoundException");
//			}
		}

	}
}
