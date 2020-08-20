import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		
		// C:\temp\result.dat
		// /home/instructor/Temp/result.dat/ 
		//System.out.println(System.getProperty("file.separator"));
		//System.out.println(File.separator);
		//-cp.;C:/temp;D:/temp
		//-cp.:/home/instructor/Temp/		
		//System.out.println(System.getProperty("path.separator"));
		//System.out.println(File.separator);
		
		File file = new File("../../JavaHome/0820/src/FileDemo.java");    // . : 현재위치           /        .. : 자기 부모
		System.out.println("getName() = " + file.getName());
		System.out.println("getPath() = " + file.getPath());
		System.out.println("getParent() = " + file.getParent());
		System.out.println("getAbsolutePath() = " + file.getAbsolutePath());
		try {
			System.out.println("getCanonicalPath() = " + file.getCanonicalPath());   // 어떻게 코딩해도 절대경로로 나옴(진짜 정규경로)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} 