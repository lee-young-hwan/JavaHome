import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		
		//FileInputStream fis; // 선언

		try(FileInputStream fis = new FileInputStream("C:/temp/data.txt")){
			//System.out.println(4 / 2);
			//System.out.println("여기를 출력할까요? ");
		} catch (Exception e) {
			System.out.println("File을 찾을 수 없습니다");
			}
		
//		} finally {
//			//System.out.println("여기는 무조건 처리합니다");
//			try {
//				fis.close();
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
	}
}
