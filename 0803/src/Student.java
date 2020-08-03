/*
 *  this의 용법
 *  1. this : (나의) 멤버변수와 멤버메소드를 명시적으로 구별하고자 할 때, 멤버변수와 지역변수가 같으면 컴퓨터가 구별하지 못함
 */

public class Student {  // 클래스의 모든 변수는 private
	private String name, hakbun;
	private int kor, eng, mat, tot;
	private double avg;
	private char grade;
	
	public String getName() {
		return name;  // this가 생략되어 있음
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
	
	
	
	
	/*private int kor; // 나의 국어점수
	public int getKor(){
		if(this.kor >= 0 && this.kor <= 100)
		return this.kor;
		else return -1;
	}
	
	public void setKor(int ko) {
		if(ko >= 0 && ko <= 100) this.kor = ko;  // this(멤버변수) = 지역변수
		else kor = -1;
	}
	public void print() {
		System.out.print(this);
	}*/
}
