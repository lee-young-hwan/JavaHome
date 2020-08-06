

public class OverrideDemo1 {
	public static void main(String[] args) {
		Point p1 = new Point(3,5); 
		System.out.println(p1);
		
		Point p2 = new Point(3,5);
		System.out.println(p2);
		
		System.out.println(p1 == p2);         // �ּҺ�
		System.out.println(p1.equals(p2));    // ������
	}
}

class Point extends Object{
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y; 
	}
	
	@Override
	
	public boolean equals(Object obj) {
		Point other = (Point)obj;
		if (this.x == other.x && this.y == other.y) return true;
		else return false;
		
	}
	
	
	
	public String toString() {
		return "(x,y) =(" + x + ", " + y  + ")";
	}
}
