

public class Main {                         // main�� ª��
	public static void main(String[] args) {
		Student [] array = new Student[3];
		Input.input(array);                 // static�̴ϱ� Ŭ�����̸��� �����´� (�Է�)
		Calc.calc(array);                   // static�̴ϱ� Ŭ�����̸��� �����´� (���)
		Sorting.insertionSort(array);       //                            (����)
		Output.output(array);               // static�̴ϱ� Ŭ�����̸��� �����´� (���)
	}
}
