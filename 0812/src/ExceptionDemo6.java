

public class ExceptionDemo6 {
	public static void main(String[] args) {
		Test t = null;
		try {
			t = new Test(110, 110);
		} catch(EnglishException | KoreanException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(t);
	}
}
