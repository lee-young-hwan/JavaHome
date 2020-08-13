import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		String [] array = {"Java", "Python", "Apple", "Oracle", "World", "Java", "Oracle", "MariaDB"};
		
		Set<String> hashset = new HashSet<String>();
		Set<String> treeset = new TreeSet<String>();
		for (String str : array) {
			hashset.add(str);
			treeset.add(str);
		}
		System.out.println(hashset);  // �ߺ�����,
		System.out.println(treeset);  // �ߺ�����, �ڵ����� (�ߺ����� �ʰ� �����Ҷ����� ����)
	}
}
