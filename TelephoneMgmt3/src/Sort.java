import java.util.Arrays;

public class Sort {
	private Telephone[] array;
	
	public Sort(Telephone[] array) {
		this.array = array;
	}

	public void sort() {
		Arrays.sort(this.array);  // Comparable �ڽ� Ŭ������ �迭�� �����Ѵ�.
	}
	
}
