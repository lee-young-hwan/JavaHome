import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		
		//FileInputStream fis; // ����

		try(FileInputStream fis = new FileInputStream("C:/temp/data.txt")){
			//System.out.println(4 / 2);
			//System.out.println("���⸦ ����ұ��? ");
		} catch (Exception e) {
			System.out.println("File�� ã�� �� �����ϴ�");
			}
		
//		} finally {
//			//System.out.println("����� ������ ó���մϴ�");
//			try {
//				fis.close();
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
	}
}
