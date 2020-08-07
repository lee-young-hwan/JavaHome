/*
 * Conversion / Cast
 * 1. Primitive Type
 * 1) 자동형변환(암시적형변환, implicit conversion) 작은쪽 -> 큰쪽 변환(Promotion, 승진)
 * 	  4 + 89.5 = double,  123 + "Hello" = "123Hello"
 *    
 * 2) 강제형변환(명시적형변환, explicit conversion) 큰쪽 -> 작은쪽 변환(Demotion, 강등)
 * 	  (int)89.5 = 89
 * 
 * 2. Reference Type
 * 1) 자동형변환(암시적형변환, implicit conversion, Promotion, cast up)  자식쪽 -> 부모쪽 변환  (↓)
 * 2) 강제형변환(명시적형변환, explicit conversion, Demotion, downward cast)   부모쪽 -> 자식쪽 변환 (↑)
 * 
 * 부모 주소가 자식 주소로 가면 다형성
*/

public class ObjectConversion {
	public static void main(String[] args) {
		
		//Object obj = new Object(); // 부모
		// String str = new String(); // 자식
	//	obj = str;          // 자동형변환
		Object obj;         // 부모형 선언
		obj = new String(); // 자식 생성   ,  왼쪽(상위) = 오른쪽(하위)
		double avg = 4;
		
		if (obj instanceof String) System.out.println("true");
		 
		else System.out.println("false");
		
		
//		Test test = new Test();
//		Demo demo = new Demo();
//		//test = (Test)demo;     //자식은 부모로 형변환이 된다
//		
//		if (test instanceof Demo) { // 부모가 자식으로 형변환이 될지의 여부를 테스트(instanceof 연산자)
//		demo = (Demo)test;       //부모는 자식으로 형변환이 되지 않는다
//		} else {
//			System.out.println("형변환 안됩니다."); 
//		}
	}
}

class Test{}

class Demo extends Test{}
