

public class Output {
	private Student [] array;
	
	
	public Output(Student[] array) {
		this.array = array;
	}
	
	
	private void PrintLabel(){    // 공개할 필요가 없는 메소드
		System.out.println(" <<쌍용 고등학교 성적관리프로그램>>");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("-----------------------------------------------");
	}
	public void output() {             // 출력할 학생,   new 안쓰려고 static입력, 공개해야하는 메소드
		PrintLabel();
		for (Student s : this.array) {
			System.out.println(s);     // to.String은 생략이 가능
		//	Student s = array[i];			
		//	s.print();
		}
//		for (int i = 0; i < this.array.length; i++) {
//		Student s = array[i]; 
//		s.print();
//	}   
}


}