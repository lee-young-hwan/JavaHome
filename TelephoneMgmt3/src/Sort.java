import java.util.Arrays;

public class Sort {
	private Telephone[] array;
	
	public Sort(Telephone[] array) {
		this.array = array;
	}

	public void sort() {
		Arrays.sort(this.array);  // Comparable 자식 클래스의 배열만 소팅한다.
	}
	
}
