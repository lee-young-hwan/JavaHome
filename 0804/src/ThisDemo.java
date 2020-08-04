

public class ThisDemo {
public static void main(String[] args) {
	Product ballpen = new Product();
	ballpen.name = "모나미";
	ballpen.price = 200;
	Product pencil = new Product();
//	ballpen.copy(pencil); // 값복사
//	System.out.println(pencil.name);
//	System.out.println(pencil.price);
//	ballpen.price = 500;
//	System.out.println(pencil.price);
	System.out.println("볼펜의 주소 = " + ballpen);
	
	pencil = ballpen.copy1(); // 주소복사
	
	System.out.println("연필의 주소 = " + ballpen);
	
	System.out.println(pencil.name);
	System.out.println(pencil.price);
	ballpen.price = 500;
	System.out.println(pencil.price);
}
}
