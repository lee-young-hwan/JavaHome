
// checkedException�� �ݵ�� try~catch�� ����Ѵ�
public class ExceptionDemo2 {
	public static void main(String[] args) throws Exception {
		// "5" -> 5
		// int su = Integer.parseInt("hello");
		// System.out.printf("su = %d", su);

		Student chulsu = null;
		//try {
			chulsu = new Student(100); // ����

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
			throw new KoreanException("���� ������ 0���� 100������ �Դϴ�.");
		//if (eng < 0 || eng > 100)
		//	throw new EnglishException("���� ������ 0���� 100������ �Դϴ�.");
		this.kor = kor;
		//this.eng = eng;
	}

	@Override
	public String toString() {
		return String.format("�������� = %d", this.kor);
	}

}