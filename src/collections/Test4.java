package collections;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add('A');
		a.add("Hello");
		a.add(20);
		a.add(30);
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add('A');
		a1.add("Hello0000");
		a1.add(200);
		a1.add(300);
		
//		a.removeAll(a1);
//		System.out.println(a);
		
//		a1.removeAll(a);
//		System.out.println(a1);
		
		a.retainAll(a1);
		System.out.println(a);
//		
//		System.out.println(a.equals(a1));


	}

}
