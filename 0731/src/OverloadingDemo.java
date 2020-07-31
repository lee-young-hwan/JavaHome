
/* Overloading : 메소드의 이름이 같고, 파라미터의 타입이나 갯수가 다르면 컴파일러는 다른 메소드로 인식한다.
     메소드의 이름이 같아도 파라미터의 개수나 타입이 달라야한다(오버로딩)
   static void print(메소드) = static void print(메소드) , (int su)(파라미터) != (int su, double su1)(파라미터)
     가변인자는 항상 오른쪽 끝에 있어야함    (Object...array, int su, double su1) = 이런식으로 쓰면 에러난다
     */

public class OverloadingDemo {
public static void main(String[] args) {
	print(4, 89.5, 'A');
	print(89.5, 4, 'A');
}
 static void print(int su, double su1, Object...array) {}
 static void print(double su, int su1, Object...array) {}
}