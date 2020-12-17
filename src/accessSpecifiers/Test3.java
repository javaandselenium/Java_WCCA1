package accessSpecifiers;

public class Test3 {
	int a = 10;

	Test3() {
		System.out.println("default constructor");
	}

	void tea() {
		System.out.println("default method drinking eat");
	}

	public static void main(String[] args) {
	Test3 t3=new Test3();
	System.out.println("Default varaoble "+t3.a);
	t3.tea();
	
	

	}

}
