import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Scanner scan; // ��� ����
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
			String line = this.scan.nextLine();   //2   422-5123    ������    1084
			String [] dataArray = line.split("\\s+"); // �ѹ� �̻��� �����̽��� �������� �и�
			int kind = Integer.parseInt(dataArray[0]);  // "2" -> 2
			int quantity = Integer.parseInt(dataArray[3]);
			Telephone telephone = new Telephone(kind, dataArray[1], dataArray[2], quantity);
			this.array[i] = telephone;
				
		}
	}
}
