package constructor;

public class Demo {

	Demo(int a) {
		System.out.println(a);
	}

	Demo(int a, int b) {
		System.out.println(a + b);
	}

	Demo(int a, double b) {
		System.out.println(a + b);
	}

	Demo(double b, String a, int c) {
		System.out.println(b + c + a);
	}

	public static void main(String[] args) {
     Demo d=new Demo(10,23.990);
     Demo d1=new Demo(100);
     Demo d2=new Demo(90.00,"Hello", 34);
	}

}
