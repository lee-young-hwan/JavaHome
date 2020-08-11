
public class Telephone implements Comparable<Telephone> {
	private int kind, quantity, sum, tax, fee, gibon;
	private String tel, name;

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGibon() {
		return gibon;
	}

	public void setGibon(int gibon) {
		this.gibon = gibon;
	}

	public Telephone(int kind, String tel, String name, int quantity) {

		this.kind = kind;
		this.tel = tel;
		this.name = name;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		// 구분 전화번호 이름 기본요금 통화료 세금 합계
		return String.format("%d\t, %s\t, %s\t, %d\t, %d\t, %d\t, %d", this.kind, this.tel, this.name, this.gibon,
				this.sum, this.tax, this.fee);
	}
	
	void print() {
		
		System.out.println("<<7월 전화 요금 명세서");
		System.out.println("--------------------------------------");
		System.out.println("구분\t전화번호\t이름\t기본요금\t통화료\t세금\t합계");
		System.out.printf("%d\t%s\t%s\t%,d\t%,d\t%,d%n",this.kind, this.tel, this.name, this.gibon,
				this.sum, this.tax, this.fee );
		
	}
	

	@Override
	public int compareTo(Telephone other) {
		if (this.fee > other.fee)
			return 1;
		else if (this.fee < other.fee)
			return -1;
		else
			return 0;
	}
}
