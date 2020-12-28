package collections;

import java.util.ArrayList;

public class Test2 {

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
		a1.add("Hello");
		a1.add(20);
		a1.add(30);
		//a.clear();
		//System.out.println(a.isEmpty());
		System.out.println(a.containsAll(a1));
		System.out.println(a);
		
		

	}

}
