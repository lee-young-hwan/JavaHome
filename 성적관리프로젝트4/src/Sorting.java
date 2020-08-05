

public class Sorting {
	private Student [] array;
	


 public Sorting(Student[] array) {
		this.array = array;
	}


public void insertionSort() {
	int i, j;
	Student temp;
	for (i = 1; i <this.array.length;i++)
	{
		temp = array[i]; // 1단계
		
		// temp가 크면 내림차순
		for ( j = i - 1; j >= 0 && array[j].getTot() < temp.getTot();j--);{ // 2단계(중요)
			array[j+1] = array[j];
		}
		array[j+1] = temp;
	}
}
}
