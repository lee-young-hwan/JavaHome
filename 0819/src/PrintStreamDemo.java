import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) { // 생성자 안에 생성자 또 넣기 가능 
		try(PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("C:/temp/result.dat")), true)) {
			ps.printf("%-10s%10s%10d%10.1f%10c%n", "2020-001", "한지민", 363, 90.12345678, 'A');
			ps.printf("%s", "Hello, World");
			System.out.println("Save Success");
			
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
