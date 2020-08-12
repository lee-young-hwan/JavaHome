import java.io.File;
import java.util.Scanner;

/*
 * 문자열 파싱
 * " 2     422-5123   박은지    1084 "
 * 1. String class의 split()
 * 2. java.util.StringTokenizer class
 * 3. java.util.Scanner class
 */

public class StringParsingDemo {
	public static void main(String[] args) throws Exception{
		String str = "	2     422-5123   박은지    1084	";

		/*
		// 1번째 방법
		String [] array = str.trim().split("\\s+");
		System.out.println(array.length);
		
		// 2번째 방법
		StringTokenizer st = new StringTokenizer(str.trim());  // StringTokenizer : 스페이스바, 탭 등을 만나면 알아서 짤라줌
		String [] array = new String[st.countTokens()];
		int index = 0; // 초기값
		while(st.hasMoreElements()) {
			array[index] = st.nextToken();
			index++;
		}*/
		
		// 3번째 방법
		// String str = "	2     422-5123   박은지    1084	";
		/*Scanner scan = new Scanner(str.trim());
		Scanner other = scan.useDelimiter("\\s+"); 
		String [] array = new String [100];
		int index = 0;
		while (other.hasNext()) {
			array[index] = other.next();
			index++;
		}
		for (int i = 0; i < index; i++) {
			System.out.println(array[i]);
		}*/
		
		//System.out.println(other.nextInt());
		//System.out.println(other.next());
		//System.out.println(other.next());
		//System.out.println(other.nextInt());
		//System.out.println(array[1]);
		
		
		File file = new File("C:/temp/data.txt");
		Scanner scan = new Scanner(file);
		int sum = 0;
		while(scan.hasNextInt()) {
			//System.out.println(scan.nextLine());
			sum += scan.nextInt();
		}
		System.out.println(sum);
	}
}
