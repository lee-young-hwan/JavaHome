import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Input {
	private Account [] array;
	private Scanner scan;
	
	public Input(Account[] array) {                    // 6.�������� ������ ������� �ʱ�ȭ, source -> using field
		this.array = array;
		File file = new File("./data.dat");            // 7.��μ���(�� ��ġ)
		
		try {                                          // 8. new Scanner�� ���콺 �÷��� add~~��¼�� Ŭ���ؼ� try~catch ����
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "�����Ͻ� ������ ã�� �� �����ϴ�");
		}
	}
	
	public void input() {
		for (int i = 0; i < this.array.length; i++) {  // 9. ,������, ������, ������ ��� 1�پ� ���
			String line = this.scan.nextLine();        // ���� ����� ������ 178.3 72.4 34 �� ��µ�
			String [] dataArray = line.split("\\s+");  // String ������ 1ĭ�̻� �ڸ�
			
			double height = Double.parseDouble(dataArray[1]);  // "178.3" -> 178.3 ���� �����
			double weight = Double.parseDouble(dataArray[2]);  // "72.4"  -> 72.4    �� �����
			int age = Integer.parseInt(dataArray[3]);          // "34"    -> 34     �� �����
			
			Account acc = new Account(dataArray[0], height, weight, age);
			
			this.array[i] = acc;                       // 10. acc�� �ּҸ� array[i]�� ����
		}
	}
}
