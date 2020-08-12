import java.util.Scanner;

public class ExceptionDemo7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int kor;
		do {
			System.out.print("국어점수 : ");
			try {
				kor = scan.nextInt();
				if(check(kor))
					break;
				else 
					throw new KoreanException("잘못된 국어점수입니다.\n확인 후 다시 입력해 주세요.");
			}catch(KoreanException ex) {
				System.out.println(ex.getMessage());
			}
		} while(true);
		System.out.println("국어점수 = " + kor);
	}
	static boolean check(int jumsu) {
		if (jumsu < 0 || jumsu > 100)
			return false;
		else
			return true;
	}
}
