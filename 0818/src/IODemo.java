import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) {
		
		//System.out.print("�� ���� ���ڸ� �Է��� �ּ��� : ");
		System.out.print("����� ��� ������ �����Ͻʴϱ�? : "); 
		//InputStream is = new InputStream();
		InputStream is = System.in; // ǥ�� �Է� ��Ʈ�� (Ű����κ��� �о����)
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