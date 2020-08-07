

public class BoxWeight extends Box {
	private int weight;

	public BoxWeight(int length, int width, int height, int weight) {
		super(length, width, height);   // 부모에게 넘겨줌
		this.weight = weight;           // 자식은 Weight를 가짐
	}

	@Override
	public String toString() {
		return super.toString() + "BoxWeight[weight=" + weight + "]";
				
	}
	
	
	
	
}
