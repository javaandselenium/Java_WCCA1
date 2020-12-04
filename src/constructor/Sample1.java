package constructor;

public class Sample1 {
	Sample1(int a, String b) {
		System.out.println(a + b);
	}

	Sample1(int a, double b) {
		this(5.6f);
		System.out.println(a + b);
	}

	Sample1(float a) {
		this(10, "bye");
		System.out.println(a);
	}

	public static void main(String[] args) {
		Sample1 s=new Sample1(50.9f);

	}

}
