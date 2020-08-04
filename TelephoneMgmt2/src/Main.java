

public class Main {
public static void main(String[] args) {
	
	Telephone [] array = new Telephone[3];
	
	
	Input input = new Input(array);
	input.input();
	
	Calc calc = new Calc();
	calc.calc(array);
	
	Output output = new Output();
	output.output(array);
	
}
}
