package methods;

public class Test7 {
	int a=10;
	int b=20;
	
	public void add() {
		System.out.println(a+b);
	}
	
	public void sub() {
		System.out.println(a-b);
	}
	
	public void mul() {
		int a=10;
		int b=30;
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Test7 t=new Test7();
		t.add();
		t.sub();
		t.mul();

	}

}
