

public class Output {
	private Student [] array;
	
	
	public Output(Student[] array) {
		this.array = array;
	}
	
	
	private void PrintLabel(){    // ������ �ʿ䰡 ���� �޼ҵ�
		System.out.println(" <<�ֿ� ����б� �����������α׷�>>");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
	}
	public void output() {             // ����� �л�,   new �Ⱦ����� static�Է�, �����ؾ��ϴ� �޼ҵ�
		PrintLabel();
		for (Student s : this.array) {
			System.out.println(s);     // to.String�� ������ ����
		//	Student s = array[i];			
		//	s.print();
		}
//		for (int i = 0; i < this.array.length; i++) {
//		Student s = array[i]; 
//		s.print();
//	}   
}


}