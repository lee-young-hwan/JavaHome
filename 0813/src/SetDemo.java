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
		System.out.println(hashset);  // 중복제거,
		System.out.println(treeset);  // 중복제거, 자동소팅 (중복되지 않고 저장할때마다 소팅)
	}
}
