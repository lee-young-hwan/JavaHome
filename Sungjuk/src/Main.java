

public class Main {
	public static void main(String[] args) {
		Account [] array = new Account[12];
		
		Input input = new Input(array);
		input.input();
		
		Calc calc = new Calc(array);
		calc.calc();
		
		Output output = new Output(array);
		output.output(array);
	}
}
