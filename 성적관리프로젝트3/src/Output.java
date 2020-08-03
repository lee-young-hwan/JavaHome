

public class Output {
	static void PrintLabel(){
		System.out.println(" <<쌍용 고등학교 성적관리프로그램>>");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("-----------------------------------------------");
	}
	static void output(Student [] array) {             // 출력할 학생,   new 안쓰려고 static입력
		PrintLabel();
		for (int i = 0; i < array.length; i++) {
		Student s = array[i]; 
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n", s.getHakbun(), s.getName(), s.getKor(), s.getEng(), s.getMat(), s.getTot(), s.getAvg(), s.getGrade());
	}   
}
}