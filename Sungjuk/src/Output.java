

public class Output {
	private Account[] array;
	
	public Output(Account[] array) {
		this.array = array;
	}

	private void printLabel() {
		System.out.println("<<쌍용고 성적관리프로그램>>");
		System.out.println("학번\t 이름\t 국어 \t 영어\t 수학\t 역사\t 총점\t 평균\t 평점");
		System.out.println("----\t ----\t ----\t ----\t ----\t ----\t ----\t ----\t ----");
	}

	public void output(Account [] array) {
		printLabel();
		for (Account acc: this.array) acc.print();
		
	


	}
}
