
public class EverySort {
	
	static void bubbleSort(int [] array){  // Call By Reference
		for (int i = 0; i < array.length - 1; i++){
			for(int j = 0; j < array.length - 1; j++){
				if (array[j] > array[j+1]){
					int temp = array[j]; array[j] = array[j+1]; array[j+1] = temp;
			}
		}
	}
}
	static void selectionSort (int [] array){
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i]; array[i] = array[j]; array[j] = temp;
				}
			}
		}			
	}
	static void insertionSort (int [] array){
		int i, j, tmp;
		for(i = 1; i < array.length; i++)
		{
			tmp = array[i]; // 1´Ü°è
			for (j = i -1; j >= 0 && array[j] > tmp; j--)
			{
				array[j+1] = array[j];
			}
			array[j+1] = tmp;
		}
	}
	static void quickSort (int [] array){
		
	}
}

