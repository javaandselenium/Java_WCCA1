package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add('A');
		a.add("Hello");
		ArrayList a1=new ArrayList();
		a1.add(23.90);
		a1.add("");
		a1.add(true);
		a1.add("Hello");
		System.out.println(a);
		//System.out.println(a.addAll(a1));
		System.out.println(a.addAll(1,a1));
		System.out.println(a);
		

	}

}
