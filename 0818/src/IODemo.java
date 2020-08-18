import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) {
		
		//System.out.print("한 개의 글자를 입력해 주세요 : ");
		System.out.print("당신은 어느 계절을 좋아하십니까? : "); 
		//InputStream is = new InputStream();
		InputStream is = System.in; // 표준 입력 스트림 (키보드로부터 읽어들임)
		String season = "";
		try {
			while(true) {
			int su = is.read(); // ASCII code
			if (su < 0 || (char)su == '\n') break;
			else season += (char)su;

		} 
		System.out.println("season = " + season);
	}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
