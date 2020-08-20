

public class Student {
 private String name, hakbun;
 private int kor, eng, mat, tot, edp;
 private double avg;
 private char grade;
 
 
 
public Student(String hakbun, String name, int kor, int eng, int mat, int edp) {
	this.hakbun = hakbun;
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.mat = mat;
	this.edp = edp;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getHakbun() {
	return hakbun;
}
public void setHakbun(String hakbun) {
	this.hakbun = hakbun;
}
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}

public int getEdp() {
	return edp;
}
public void setEdp(int edp) {
	this.edp = edp;
}

public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getMat() {
	return mat;
}
public void setMat(int mat) {
	this.mat = mat;
}
public int getTot() {
	return tot;
}
public void setTot(int tot) {
	this.tot = tot;
}
public double getAvg() {
	return avg;
}
public void setAvg(double avg) {
	this.avg = avg;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}

@Override  // 의도적으로 재정의
public String toString() {
	return String.format("Student [name=%s, hakbun=%s, kor=%s, eng=%s, mat=%s, tot=%s, avg=%s, grade=%s]", name, hakbun,
			kor, eng, mat, tot, avg, grade);
}

//public void print() {
//	System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n", this.hakbun, name, kor, eng, mat, tot, avg, grade);
//}
 
}

