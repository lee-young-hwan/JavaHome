import java.util.ArrayList;

public class Main {                         // main은 짧게
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>(12);
		Input input = new Input(list);
		input.input();                 // static이니까 클래스이름을 가져온다 (입력)
		
		Calc calc = new Calc(list);
		calc.calc();                   // static이니까 클래스이름을 가져온다 (계산)
//		
		Sorting sorting = new Sorting(list);     //                 (소팅)
//		sorting.insertionSort();
		
//		Output output = new Output(list);
//		output.output();
		
		Output1 output = new Output1(list);
		output.output();
		
		
		
		              
	}
}
