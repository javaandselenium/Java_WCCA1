package methods;

public class Test3 {
	int a = 100;
	static int b = 200;

	public void add() {
		System.out.println("adding");
	}

	public static void sub() {
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
		System.out.println(Test3.b);
		Test3.sub();
		Test3 t = new Test3();
		System.out.println(t.a);
		t.add();
	}

}
