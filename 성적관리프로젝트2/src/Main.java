

public class Main {                         // main은 짧게
	public static void main(String[] args) {
		Student [] array = new Student[3];
		Input.input(array);                 // static이니까 클래스이름을 가져온다 (입력)
		Calc.calc(array);                   // static이니까 클래스이름을 가져온다 (계산)
		Sorting.insertionSort(array);       //                            (소팅)
		Output.output(array);               // static이니까 클래스이름을 가져온다 (출력)
	}
}
