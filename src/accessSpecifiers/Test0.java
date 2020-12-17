package accessSpecifiers;

public class Test0 {
	public int a = 10;

	public Test0() {
		System.out.println("public constructor");
	}

	public void tea() {
		System.out.println("public method drinking eat");
	}

	public static void main(String[] args) {
    Test0 t=new Test0();
    System.out.println("public varaible "+t.a);
    t.tea();
    
    Test3 t3=new Test3();
	System.out.println("Default varaoble "+t3.a);
	t3.tea();
	
    
	}

}
