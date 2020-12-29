package exceptionHandling;

public class Test0 {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		
		try {
		int b=1/0;
		}
		catch(ArithmeticException p) {
		System.out.println("handled");
		}
		System.out.println("hello");

	}

}
