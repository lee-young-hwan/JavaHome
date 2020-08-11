import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Scanner scan; // 멤버 변수
	private Telephone [] array;
	
	public Input(Telephone[] array) {
		
		this.array = array;
		
		File file = new File("./data.txt");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	
	
	public void input() {
		for (int i = 0; i <this.array.length; i++) {
			String line = this.scan.nextLine();   //2   422-5123    박은지    1084
			String [] dataArray = line.split("\\s+"); // 한번 이상의 스페이스바 기준으로 분리
			int kind = Integer.parseInt(dataArray[0]);  // "2" -> 2
			int quantity = Integer.parseInt(dataArray[3]);
			Telephone telephone = new Telephone(kind, dataArray[1], dataArray[2], quantity);
			this.array[i] = telephone;
				
		}
	}
}
