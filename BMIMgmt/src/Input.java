import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Input {
	private Account [] array;
	private Scanner scan;
	
	public Input(Account[] array) {                    // 6.생성자의 역할은 멤버변수 초기화, source -> using field
		this.array = array;
		File file = new File("./data.dat");            // 7.경로설정(내 위치)
		
		try {                                          // 8. new Scanner에 마우스 올려서 add~~어쩌고 클릭해서 try~catch 삽입
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "지정하신 파일을 찾을 수 없습니다");
		}
	}
	
	public void input() {
		for (int i = 0; i < this.array.length; i++) {  // 9. ,박지민, 김지민, 한지민 등등 1줄씩 출력
			String line = this.scan.nextLine();        // 현재 여기는 박지민 178.3 72.4 34 가 출력됨
			String [] dataArray = line.split("\\s+");  // String 단위로 1칸이상씩 자름
			
			double height = Double.parseDouble(dataArray[1]);  // "178.3" -> 178.3 으로 변경됨
			double weight = Double.parseDouble(dataArray[2]);  // "72.4"  -> 72.4    로 변경됨
			int age = Integer.parseInt(dataArray[3]);          // "34"    -> 34     로 변경됨
			
			Account acc = new Account(dataArray[0], height, weight, age);
			
			this.array[i] = acc;                       // 10. acc의 주소를 array[i]에 삽입
		}
	}
}
