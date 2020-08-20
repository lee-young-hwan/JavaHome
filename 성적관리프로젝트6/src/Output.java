import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

class Output {
	private ArrayList<Student> list;
	private PrintStream ps; //멤버변수 초기화는 생성자가 함
	
	public Output(ArrayList<Student> list) {
		this.list = list;
		String path = "./result(1).dat";
		try {
			this.ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(path)), true);
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		}
	}
	
	
	private void PrintLabel(){    // 공개할 필요가 없는 메소드
		this.ps.println(" <<쌍용 고등학교 성적관리프로그램>>");
		this.ps.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
		this.ps.println("-----------------------------------------------");
	}
	 void output() {             // 출력할 학생,   new 안쓰려고 static입력, 공개해야하는 메소드
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