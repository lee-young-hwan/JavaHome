import java.util.ArrayList;

public class Calc {
	private ArrayList<Student> list;
	Calc(ArrayList<Student> list) {
		this.list = list;
	}
	void calc() {               // 계산할 학생,   new 안쓰려고 static입력
		for (int i = 0; i < this.list.size(); i++) {
		Student s = this.list.get(i);
		//int tot = array[i].kor + array[i].eng + array[i].mat;
		int tot = s.getKor() + s.getEng() + s.getMat() + s.getEdp();
		double avg = tot /4.;
		char grade = (avg >= 90) ? 'A' :
						(avg >= 80) ? 'B' :
							(avg >= 70) ? 'C' :
								(avg >= 60) ? 'D' : 'F';
		//array[i].tot = tot;   array[i].avg = avg;    array[i].grade = grade;
		  s.setTot(tot); s.setAvg(avg);  s.setGrade(grade);
	}
}
}