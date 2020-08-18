
@FunctionalInterface 
public interface MyInterface {
	int calculate(int a, int b); // 함수형 인터페이스 (2개이상 있으면 오류남)
  //int add(int a, int b)  이런식으로 인터페이스 함수 안에 2개가 있으면 안됌
}
