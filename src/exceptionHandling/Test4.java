package exceptionHandling;

public class Test4 {
	
	public void add() {
System.out.println(10+30);
	}
	
	public void sub() {
		try {
		int a=1/0;
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		finally {
		System.out.println("closeing of database");
		}
	}

	public static void main(String[] args) {
		Test4 t=new Test4();
		t.add();
		t.sub();
		

	}

}
