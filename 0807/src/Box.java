

public class Box {
	private int length, width, height;

	public Box(int length, int width, int height) {  // 积己磊(using field)
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int getVolume() {                         // 流立父惦
		return length * width * height;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}
