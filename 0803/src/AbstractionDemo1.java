

public class AbstractionDemo1 {
public static void main(String[] args) {
	Car [] array; //선언
	array = new Car[3]; //생성
	array[0] = new Car(); // sonata
	array[1] = new Car(); // carnival
	array[2] = new Car(); // matiz
	
	array[0].name = "소나타";
	array[1].name = "카니발";
	array[2].name = "마티즈";
	
}
}
