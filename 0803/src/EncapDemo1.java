

public class EncapDemo1 {
	public static void main(String[] args) {
		Student chulsu = new Student();
		//System.out.println(chulsu);
		//chulsu.print();
		chulsu.setKor(90);
		int kor = chulsu.getKor();
		if ( kor > 0 ) System.out.println("�������� = " + kor);
	    else System.out.println("�߸��� ��������");
		
	}
}
