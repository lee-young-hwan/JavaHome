

public class BoxWeight extends Box {
	private int weight;

	public BoxWeight(int length, int width, int height, int weight) {
		super(length, width, height);   // �θ𿡰� �Ѱ���
		this.weight = weight;           // �ڽ��� Weight�� ����
	}

	@Override
	public String toString() {
		return super.toString() + "BoxWeight[weight=" + weight + "]";
				
	}
	
	
	
	
}
