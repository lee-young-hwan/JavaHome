

public class InstanceOfDemo {
	public static void main(String[] args) {
		//Mammal m = new Mammal();  // 부모형
		Korean ko = new Korean(); // 자식형
		// "한국인은 포유류이다." 
		//m = (Mammal)ko; // 자식이 부모형으로 변환하는 것은 무조건 성공
		
		// "포유류는 한국인이다."
		//ko = (Korean)m;  // m = (Mammal)ko; 과정을 겪지 않으면 에러가난다
		
		Object obj = new Object(); // 부모
		String str = new String(); // 자식
		
		obj = str;
		//str = (String)obj; 
		
		if (obj instanceof String) System.out.println("형변환 가능"); // ( 참조변수 instanceof(관계연산자) 데이터타입 )
		else System.out.println("형변환 불가능"); 
	}
}
