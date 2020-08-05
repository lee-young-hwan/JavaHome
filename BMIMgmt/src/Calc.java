

public class Calc {
	private Account [] array;
	
	
	public Calc(Account[] array) {
		this.array = array;
	}
	
	
	public void calc() {
		for (int i = 0; i < this.array.length; i++) {
			Account acc = this.array[i];
			double height = acc.getHeight() / 100; // 178 -> 1.78
			double weight = acc.getWeight();
			double bmi = weight / (height * height);
			
			String level = this.bmiToLevel(bmi);
			acc.setBmi(bmi);
			acc.setLevel(level);
		}
		
	}
	
	private String bmiToLevel(double bmi) {
		String level = null;
		if (bmi >= 40) level = "고도 비만";
		else if (bmi >= 35 && bmi < 40)   level = "중증도 비만";
		else if (bmi >= 30 && bmi < 35)   level = "경도 비만";
		else if (bmi >= 25 && bmi < 30)   level = "과체중";
		else if (bmi >= 18.5 && bmi < 25) level = "정상";
		else level ="저체중";		
		return level;
	}
	
}
