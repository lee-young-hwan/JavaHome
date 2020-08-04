

public class Main {
public static void main(String[] args) {
	Input input = new Input();
	Telephone phone = input.input();
	
	Calc calc = new Calc();
	calc.calc(phone);
	
	Output output = new Output();
	output.output(phone);
	
}
}
