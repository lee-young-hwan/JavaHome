

public class Output {
	static void PrintLabel(){
		System.out.println(" <<�ֿ� ����б� �����������α׷�>>");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
	}
	static void output(Student [] array) {             // ����� �л�,   new �Ⱦ����� static�Է�
		PrintLabel();
		for (int i = 0; i < array.length; i++) {
		Student s = array[i]; 
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n", s.getHakbun(), s.getName(), s.getKor(), s.getEng(), s.getMat(), s.getTot(), s.getAvg(), s.getGrade());
	}   
}
}