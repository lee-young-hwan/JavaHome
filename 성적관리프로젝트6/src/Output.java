import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

class Output {
	private ArrayList<Student> list;
	private PrintStream ps; //������� �ʱ�ȭ�� �����ڰ� ��
	
	public Output(ArrayList<Student> list) {
		this.list = list;
		String path = "./result(1).dat";
		try {
			this.ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(path)), true);
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		}
	}
	
	
	private void PrintLabel(){    // ������ �ʿ䰡 ���� �޼ҵ�
		this.ps.println(" <<�ֿ� ����б� �����������α׷�>>");
		this.ps.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		this.ps.println("-----------------------------------------------");
	}
	 void output() {             // ����� �л�,   new �Ⱦ����� static�Է�, �����ؾ��ϴ� �޼ҵ�
		PrintLabel();
		for (Student s : this.list) {
			System.out.println(s);     // to.String
			
			System.out.println("Save success");
			this.ps.close();
		//	Student s = array[i];			
		//	s.print();
		}
//		for (int i = 0; i < this.array.length; i++) {
//		Student s = array[i]; 
//		s.print();
//	}   
}


}