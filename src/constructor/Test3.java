package constructor;

public class Test3 {
	static {
		System.out.println("static block");
	}
	
	Test3(){
		System.out.println("constructor");
	}
	
	{
		System.out.println("Non static block");
	}

	public static void main(String[] args) {
    System.out.println("Main method");
     Test3 t=new Test3();
	}

}
