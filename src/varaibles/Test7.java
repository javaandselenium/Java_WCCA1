package varaibles;

//cannot be inhertiered
public final class Test7 {

	final int a=10;//we cannot reinitalize the value
	a=20;
	
	//cannot be overriden
	public final void demo(int a) {
		System.out.println("hello");
	}
	
	public final void demo(String b) {
		System.out.println("hello");
	}

}
