package methods;

public class Test16 {

public static void main(int a) {
		System.out.println(a);
	}

public static void main(String b,int a,double c) {
	System.out.println(b+a+c);
}

public static void main(double a,int b) {
	System.out.println(a+b);
}



public static void main(String[] args) {
		Test16.main(10,20);
		Test16.main("Hello",10,20.00);
	}

}
