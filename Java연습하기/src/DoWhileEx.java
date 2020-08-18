import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하시려면, q를 입력하세요");
		
		String str = null;
		
		// do-while문은 반드시 한번은 실행한다
		do {
			
			System.out.print(">");
			str = scan.nextLine();
			
			System.out.println("입력받은 메세지 :" + str);
			
		} while(str.equals("q"));
		
		System.out.println("프로그램 종료");
		scan.close();
		
	}
}
