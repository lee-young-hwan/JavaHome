

public class Sorting {
 static void insertionSort(Student[] array) {
	int i, j;
	Student temp;
	for (i = 1; i < array.length;i++)
	{
		temp = array[i]; // 1�ܰ�
		
		// temp�� ũ�� ��������
		for ( j = i - 1; j >= 0 && array[j].tot > temp.tot;j--);{ // 2�ܰ�(�߿�)
			array[j+1] = array[j];
		}
		array[j+1] = temp;
	}
}
}
