

public class Main {                         // main은 짧게
	public static void main(String[] args) {
		Student [] array = new Student[3];
		Input input = new Input(array);
		input.input();                 // static이니까 클래스이름을 가져온다 (입력)
		
		Calc calc = new Calc(array);
		calc.calc();                   // static이니까 클래스이름을 가져온다 (계산)
		
		Sorting sorting = new Sorting(array);     //                 (소팅)
		sorting.insertionSort();
		
		Output output = new Output(array);
		output.output();
		
		
		              
	}
}
