

public class CallByRefDemo {
public static void main(String[] args) {
	String str = "Hello";
	StringBuffer sb = new StringBuffer("Hello");
	System.out.println("���� ��");
	System.out.println("str = " + str + ", sb = " + sb.toString());
	change(str,sb);// Call By Reference
	System.out.println("���� ��");
	System.out.println("str = " + str + ", sb = " + sb.toString());
}
 static void change(String str, StringBuffer sb) {
	 str += ", World";
	 sb.append(", World");
	 System.out.println("�Լ�����");
	 System.out.println("str = " + str + ", sb = " + sb.toString());
 }
}
