import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(4/0); // ArithmeticException형 instance 생성 -> throw
		} catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException | ClassCastException ex) {  // 부모,자식은 Exception을 같이 쓸수없다
			System.out.println(ex.toString());
		 

//		File file = new File("C:/temp/data3523525325235235.txt");
//		try {
//			Scanner scan = new Scanner(file); // FileNotFoundException형 instance를 throw
//		} catch (Exception ex) { // Exception ex = new FileNotFoundException(); 
//			
//			System.out.println(ex.getMessage());   // 1. ex.getMessage() : 간단한 메시지만 보여줌
//			
//			JOptionPane.showMessageDialog(null, ex.getMessage());  // 화면에 에러가 난 메시지창을 출력함
//			
//			System.out.println(ex); // 2. ex.toString() : 메시지와 타입을 같이 보여줌
//			ex.printStackTrace(); // 3. ex.printStackTrace : 몇번째 라인에서 에러가 난건지 아주 자세하게 보여줌
			
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
