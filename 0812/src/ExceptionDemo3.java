public class ExceptionDemo3 {
	public static void main(String[] args) {
		a();
	}
	static void a() {b();}
	static void b() {
		try {
			c();
		}catch (Exception ex) {
			System.out.println("b()���� �����");
		}
		}
	static void c() {d();}
	static void d() {
		System.out.println(4 / 0);
	}
}
