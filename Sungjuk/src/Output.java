

public class Output {
	private Account[] array;
	
	public Output(Account[] array) {
		this.array = array;
	}

	private void printLabel() {
		System.out.println("<<�ֿ�� �����������α׷�>>");
		System.out.println("�й�\t �̸�\t ���� \t ����\t ����\t ����\t ����\t ���\t ����");
		System.out.println("----\t ----\t ----\t ----\t ----\t ----\t ----\t ----\t ----");
	}

	public void output(Account [] array) {
		printLabel();
		for (Account acc: this.array) acc.print();
		
	


	}
}
