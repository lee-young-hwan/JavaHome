import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		String [] array = {"Java", "Python", "Oracle", "MariaDB"};
		for (String str : array) stack.push(str);
		//System.out.println(stack.pop() + ", " + stack.size());
		//System.out.println(stack.pop() + ", " + stack.size());
		//System.out.println(stack.pop() + ", " + stack.size());
		
		//System.out.println(stack.peek() + ", " + stack.size());   // peek : ���� ���� �����ִ��� ����Ű�⸸ �Ѵ�(����������)
		//System.out.println(stack.peek() + ", " + stack.size());
		//System.out.println(stack.peek() + ", " + stack.size());
		
		//Enumeration<String> enums = stack.elements();
		//while(enums.hasMoreElements()) {
		//	System.out.println(enums.nextElement());   // �����̴� ť�� �ϳ��� �̴°� �ƴϰ� ��ü�� �����´�   
		//}
		
		Iterator<String> iters = stack.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
		
	}
}
