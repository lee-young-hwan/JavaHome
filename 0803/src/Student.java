/*
 *  this�� ���
 *  1. this : (����) ��������� ����޼ҵ带 ��������� �����ϰ��� �� ��, ��������� ���������� ������ ��ǻ�Ͱ� �������� ����
 */

public class Student {  // Ŭ������ ��� ������ private
	private String name, hakbun;
	private int kor, eng, mat, tot;
	private double avg;
	private char grade;
	
	public String getName() {
		return name;  // this�� �����Ǿ� ����
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
	
	
	
	
	/*private int kor; // ���� ��������
	public int getKor(){
		if(this.kor >= 0 && this.kor <= 100)
		return this.kor;
		else return -1;
	}
	
	public void setKor(int ko) {
		if(ko >= 0 && ko <= 100) this.kor = ko;  // this(�������) = ��������
		else kor = -1;
	}
	public void print() {
		System.out.print(this);
	}*/
}
