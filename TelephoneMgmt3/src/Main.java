

public class Main {
public static void main(String[] args) {
	
	Telephone [] array = new Telephone[10];
	
	
	Input input = new Input(array);  // scanner�� array �ʱ�ȭ
	input.input();
	
	Calc calc = new Calc(array);
	calc.calc();
	
	Sort sort = new Sort(array);
	sort.sort();
	
	Output output = new Output(array);
	output.output();
	
}
}
