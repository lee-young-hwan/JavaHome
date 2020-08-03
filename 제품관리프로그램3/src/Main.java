public class Main {
public static void main(String[] args) {
	Product [] array = new Product[2];
	//Input input = new Input();
	//input.input(array);
	new Input().input(array);
	new Calc().calculate(array);
	new Output().print(array);
	}
}
