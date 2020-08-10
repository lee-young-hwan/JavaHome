

public class InterfaceDemo2 implements Father, Mother{
	public void father() {System.out.println("Called by father()");}
	public void mother() {System.out.println("Called by mother()");}
	public void grandFather() {System.out.println("Called by grandFather()");}
	public void grandMother() {System.out.println("Called by grandMother()");}
	
	
	
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo2();
		gf.grandFather();  //
		
		InterfaceDemo2 id = new InterfaceDemo2();
		
		GrandMother gm = id;		
		gm.grandMother();
		
		Father fa = new InterfaceDemo2();
		fa.grandFather();  
		fa.grandMother();  // 8. interface�� �ּҴ� ������ �߻�޼ҵ带 �������� �޼ҵ常 ���� ����
		fa.father();       // 9. ��ӹ��� interface�� �ּҴ� ����� interface�� �޼ҵ嵵 ���� ����
		
		System.out.println(Father.PI);
		System.out.println(Mother.PI);
		
		Mother [] array = new Mother[2]; // 10. interface �迭���� �� interface �ڽ� Ŭ������ �����. 
		array[0] = id;
		array[1] = new InterfaceDemo2();
		for (Mother m : array) {
		m.mother();
		}
	}
}
