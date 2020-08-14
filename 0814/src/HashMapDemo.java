import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		//map.put("Jan", 1);
		map.put("DBDriver", "com.jdbc.oracle.OracleDriver"); // (키, 값)
		map.put("DBUrl", "jdbc:oracle:thin:@127.0.0.1:1520:ORCL");
		map.put("DBUser", "jimin");
		map.put("DBPassword", "12345678");
		//System.out.println("Driver = " + map.get("DBDriver"));
		//System.out.println("Url = " + map.get("DBUrl"));
		//System.out.println("User = " + map.get("DBUser"));
		//System.out.println("Password = " + map.get("DBPassword"));
		Set<String> set = map.keySet();
		//System.out.println(set);  // 키
		Iterator<String> iters = set.iterator();
		while(iters.hasNext()) {
			String key = iters.next();
			//System.out.println(key);    // 순서는 보장하지 않고 값들을 중복되지 않게 출력
			System.out.println(key + " ---> " + map.get(key));
		}
	}
}
