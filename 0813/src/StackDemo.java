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
		
		//System.out.println(stack.peek() + ", " + stack.size());   // peek : 제일 위에 누가있는지 가리키기만 한다(꺼내지않음)
		//System.out.println(stack.peek() + ", " + stack.size());
		//System.out.println(stack.peek() + ", " + stack.size());
		
		//Enumeration<String> enums = stack.elements();
		//while(enums.hasMoreElements()) {
		//	System.out.println(enums.nextElement());   // 스택이던 큐던 하나씩 뽑는게 아니고 전체를 가져온다   
		//}
		
		Iterator<String> iters = stack.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
		
	}
}
