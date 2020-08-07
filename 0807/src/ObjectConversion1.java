

public class ObjectConversion1 {
	public static void main(String[] args) {
		//Bumo bumo; // 선언
		//bumo = new Bumo("한지민");
		//bumo.print();
//		System.out.println(bumo);
//		
		//Jasik jasik = new Jasik("김지민", 24);
		//jasik.print();
//		System.out.println(jasik);
		
		// 선언형은 부모형, 실제형은 자식형
		Bumo bumo = new Jasik("박지민", 28); // 다형성 (선언형=부모, 실제형=자식)
		bumo.print();
		//bumo.display();
	}
}
