 import kr.co.sist.libs.Student;
 
/*
 * 1. 동일 폴더(패키지)에서 찾는다.
 * 2. classpath에서 찾는다.
 * 3. JRE System Library에서 찾는다.
 *  1) jdk 1.8까지는 %JAVA_HOME%/lib/ext folder에 갖다 놓을것
 *  2) jdk 1.9이후는 %JAVA_HOME%/lib에 갖다 놓는다
 * 4. Reference library에서 찾는다.
 */

// import kr.co.sist.libs.Student;   // 첫번째 방법
// import kr.co.sist.libs.*;         // 두번째 방법


//import 서울시.강남구.*;
//import 경기도.용인시.*;


public class Main extends Student{
	public static void main(String[] args) {
		// 세번째 방법
		// FQN (Fully Qualified Name, 전체 경로)방법 -> 중복될 경우에만 써준다(ex: 서울시 강남구의 역삼동, 경기도 용인시의 역삼동)
		//kr.co.sist.libs.Student chulsu = new kr.co.sist.libs.Student();
		//Student chulsu = new Student();	
		//chulsu.
		
	}
}