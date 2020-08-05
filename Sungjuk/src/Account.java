

public class Account {
	private String hakbun;
	private String name;
	private Double avg;
	private int kor, eng, mat, his, tot;
	private char grade;
	
	public Account(String hakbun, String name, int kor, int eng, int mat, int his) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.his = his;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
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

	public int getHis() {
		return his;
	}

	public void setHis(int his) {
		this.his = his;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void print(){                                               
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%c\n", hakbun, name, kor, eng, mat, his, tot, avg, grade);
	}
	
	
}
