

public class Main {                         // main�� ª��
	public static void main(String[] args) {
		Student [] array = new Student[3];
		Input input = new Input(array);
		input.input();                 // static�̴ϱ� Ŭ�����̸��� �����´� (�Է�)
		
		Calc calc = new Calc(array);
		calc.calc();                   // static�̴ϱ� Ŭ�����̸��� �����´� (���)
		
		Sorting sorting = new Sorting(array);     //                 (����)
		sorting.insertionSort();
		
		Output output = new Output(array);
		output.output();
		
		
		              
	}
}
