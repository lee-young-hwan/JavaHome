import java.util.ArrayList;

public class Main {                         // main�� ª��
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>(12);
		Input input = new Input(list);
		input.input();                 // static�̴ϱ� Ŭ�����̸��� �����´� (�Է�)
		
		Calc calc = new Calc(list);
		calc.calc();                   // static�̴ϱ� Ŭ�����̸��� �����´� (���)
//		
		Sorting sorting = new Sorting(list);     //                 (����)
//		sorting.insertionSort();
		
//		Output output = new Output(list);
//		output.output();
		
		Output1 output = new Output1(list);
		output.output();
		
		
		
		              
	}
}
