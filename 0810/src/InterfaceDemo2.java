

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
		fa.grandMother();  // 8. interface형 주소는 본인의 추상메소드를 재정의한 메소드만 접근 가능
		fa.father();       // 9. 상속받은 interface형 주소는 상속한 interface의 메소드도 접근 가능
		
		System.out.println(Father.PI);
		System.out.println(Mother.PI);
		
		Mother [] array = new Mother[2]; // 10. interface 배열에는 그 interface 자식 클래스가 멤버다. 
		array[0] = id;
		array[1] = new InterfaceDemo2();
		for (Mother m : array) {
		m.mother();
		}
	}
}
