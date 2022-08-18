package chapter2;

public class HelloTest {
	public static void main(String[] args) {
		Hello object = new Hello();
		
		String answer = object.sayHello("Joey");
		System.out.println(answer);
		
		answer = object.sayHello("");
		System.out.println(answer);
	}

}
