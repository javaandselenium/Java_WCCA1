package methods;

public class Test10 {
	static int a=10;
	int b=20;
	
	public void add() {
		System.out.println("adding");
		
	}
	
	public static void sub() {
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
		System.out.println(Test10.a);
		Test10.sub();
		Test10 t=new Test10();
		System.out.println(t.b);
		t.add();
		

	}

}
