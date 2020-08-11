
public class Output {
	private Telephone[] array;

	public Output(Telephone[] array) {
		this.array = array;
	}

	public void output() {
		for (Telephone phone : this.array) {
			System.out.println(phone); // phone.toString()
		}
	}
}