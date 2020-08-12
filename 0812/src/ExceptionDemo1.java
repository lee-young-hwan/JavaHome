import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수를 입력 : ");
		
		try {
			int kor = scan.nextInt();
			if (kor < 0 || kor > 100) throw new  // throw : 예외를 처리한다
			RuntimeException("국어점수는 0부터 100점 사이여야 합니다");
		
		System.out.println("kor = " + kor);
		} catch(RuntimeException ex) {
			//JOptionPane.showMessageDialog(null, ex.getMessage());
			System.out.println(ex.getMessage());
		}
		
		
	}
}
