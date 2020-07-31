

public class VariableArgumentsDemo {
public static void main(String[] args) {
	print(1, 'A', true, 89.5);            // 배열은 배열일때만 받을수있음
}
	static void print(Object ... array) { // 입력이 배열이 아닌데 출력을 배열로 하려면  = int ... array처럼  (...) 기호를 쓴다 (가변인자)
		                                  // 모든 객체의 부모 : (Object)   
		System.out.println("length = " + array.length);
	}
}
