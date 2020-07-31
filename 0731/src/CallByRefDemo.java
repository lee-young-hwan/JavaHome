

public class CallByRefDemo {
public static void main(String[] args) {
	String str = "Hello";
	StringBuffer sb = new StringBuffer("Hello");
	System.out.println("수정 전");
	System.out.println("str = " + str + ", sb = " + sb.toString());
	change(str,sb);// Call By Reference
	System.out.println("수정 후");
	System.out.println("str = " + str + ", sb = " + sb.toString());
}
 static void change(String str, StringBuffer sb) {
	 str += ", World";
	 sb.append(", World");
	 System.out.println("함수에서");
	 System.out.println("str = " + str + ", sb = " + sb.toString());
 }
}
