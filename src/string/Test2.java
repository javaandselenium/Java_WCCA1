package string;

public class Test2 extends Object{

	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println(t.hashCode());
		
		System.out.println(t.toString());
		Test2 t1=new Test2();
		System.out.println(t.equals(t1));
	}

}
