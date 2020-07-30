

public class ReturnDemo1 {
public static void main(String[] args) {
	test(52);
}
static void test(int su) {
	System.out.println("Hello");
	if (su % 2 == 0) return ;  // Á¶°ÇÇü return
	System.out.println("World");
}
}
