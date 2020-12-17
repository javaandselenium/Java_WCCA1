package accessSpecifiers;

public class Test4 {
	protected int a = 10;

	protected Test4() {
		System.out.println("protected constructor");
	}

	protected void tea() {
		System.out.println("protected method drinking eat");
	}

	public static void main(String[] args) {
		Test4 t=new Test4();
		System.out.println("Protected varaible "+t.a);
		t.tea();

	}

}
