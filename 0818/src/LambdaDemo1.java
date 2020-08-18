

public class LambdaDemo1 {
	public static void main(String[] args) {
		Person chulsu = new Person();
		chulsu.greeting(() -> 
				System.out.println("Hello, World"));
		
		
		
//		Person chulsu = new Person();
//		chulsu.greeting(new Say() {
//
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, World");
//				System.out.println("Nice to meet you");
//			}
//			});
		
		

	}
}
class Person{
	public void greeting(Say say) {
		say.saySomething();
	}
}


@FunctionalInterface
interface Say{
	void saySomething();
}