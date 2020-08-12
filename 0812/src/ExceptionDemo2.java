
// checkedException은 반드시 try~catch를 써야한다
public class ExceptionDemo2 {
	public static void main(String[] args) throws Exception {
		// "5" -> 5
		// int su = Integer.parseInt("hello");
		// System.out.printf("su = %d", su);

		Student chulsu = null;
		//try {
			chulsu = new Student(100); // 선언

		//} catch (KoreanException | EnglishException ex) {
		//	System.out.println(ex.getMessage());
		//}
		//System.out.println(chulsu);
	}
}

class Student {
	private int kor;

	public Student(int kor) throws KoreanException/*, EnglishException*/ {
		if (kor < 0 || kor > 100)
			throw new KoreanException("국어 점수는 0부터 100점까지 입니다.");
		//if (eng < 0 || eng > 100)
		//	throw new EnglishException("영어 점수는 0부터 100점까지 입니다.");
		this.kor = kor;
		//this.eng = eng;
	}

	@Override
	public String toString() {
		return String.format("국어점수 = %d", this.kor);
	}

}