

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
		temp = array[i]; // 1�ܰ�
		
		// temp�� ũ�� ��������
		for ( j = i - 1; j >= 0 && array[j].getTot() < temp.getTot();j--);{ // 2�ܰ�(�߿�)
			array[j+1] = array[j];
		}
		array[j+1] = temp;
	}
}
}
