package accessSpecifiers;

public class Test2 {
	private int a = 10;

	private Test2() {
		System.out.println("private constructor");
	}

	private void tea() {
		System.out.println("private method drinking eat");
	}

	public static void main(String[] args) {
		Test2 t2=new Test2();
		System.out.println("Private varaible "+t2.a);
		t2.tea();
		
		Test4 t=new Test4();
		System.out.println("Protected varaible "+t.a);
		t.tea();

		
		

	}

}
