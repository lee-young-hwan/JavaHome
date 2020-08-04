import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int [] array = {3,4,7,1,2,9,3,4,6};
		quickSort(array, 0, array.length -1);
		System.out.print(Arrays.toString(array));
	}
	static void quickSort(int [] array, int start, int end) {
		int low = start, high = end, mid = array[(start+end) / 2];
		do {
			while(array[low] < mid) low++;  // 첫번째 명제
			while(array[high] > mid) high--;
			if (low <= high) // low번째와 high번째를 맞바꾼다
			{
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
				low++; high--;
			}
		}while(low <= high);
		if (start < high) quickSort(array, start, high);
		if (low < end ) quickSort(array, low, end); 
	}
}
