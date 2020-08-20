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

private void PrintLabel() throws IOException{    // 공개할 필요가 없는 메소드
	
	//this.raf.writeUTF(" <<쌍용 고등학교 성적관리프로그램>>\n".getBytes("KSC5601")); 
	this.raf.writeUTF("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점\n");
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
