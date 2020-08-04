import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Scanner scan; // ¸â¹ö º¯¼ö
	private Telephone [] array;
	
	public Input(Telephone[] array) {
		File file = new File("D:/JavaHome/TelephoneMgmt3/data.txt");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		this.array = array;
	}
	
	
	public void input() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.scan.nextLine());
		}
	}
}
