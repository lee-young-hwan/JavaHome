

public class AbstractionDemo {
public static void main(String[] args) {
	Car sonata; // ����
	sonata = new Car(); // 234�� 2.4
	sonata.name = "�ҳ�Ÿ";
	sonata.maker = "�����ڵ���";
	sonata.color = "Sliver";
	sonata.price = 25_000_000;
	sonata.print();
	
	Car carnival = new Car();
	carnival.name = "ī�Ϲ�";
	carnival.maker = "����ڵ���";
	carnival.color = "Black";
	carnival.price = 35_000_000;
	carnival.print();
}
}
