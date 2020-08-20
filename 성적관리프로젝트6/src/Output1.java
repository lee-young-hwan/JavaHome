import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

class Output1 {
	private ArrayList <Student> list;
	private RandomAccessFile raf;

	public Output1(ArrayList<Student> list) {
		this.list = list;
		String path = "./result1.dat";
		try {
		this.raf = new RandomAccessFile(path, "rw");
	}catch(FileNotFoundException e) {
		System.out.println(e);
	
	}
}

private void PrintLabel() throws IOException{    // ������ �ʿ䰡 ���� �޼ҵ�
	
	//this.raf.writeUTF(" <<�ֿ� ����б� �����������α׷�>>\n".getBytes("KSC5601")); 
	this.raf.writeUTF("�й�\t�̸�\t����\t����\t����\t����\t���\t����\n");
	this.raf.writeUTF("-----------------------------------------------"); 
}

void output() {
	try {
	PrintLabel();
	}catch(IOException ex) {
		System.out.println(ex);
	}
	System.out.println("Save Success.");
}
}
