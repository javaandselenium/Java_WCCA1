package methods;

public class Test14 {
public void add(int a,int b) {
	System.out.println(a+b);
}

public void add(double a,int b) {
	System.out.println(a+b);
}

public void add(int a, double b) {
	System.out.println(a+b);
}

public void add(int a,int b,int c) {
	System.out.println(a+b+c);
}

public void add(double a,double b,int c) {
	System.out.println(a+b+c);
}

public void add(int a,double b,int c,double d) {
	System.out.println("a+b+c+d");
}
	
	public static void main(String[] args) {
		Test14 t=new Test14();
		t.add(20.0,40.0, 10);
		t.add(10,50.0);
		t.add(60.0,67);
		t.add(10,20);
		t.add(30,40);

	}

}
