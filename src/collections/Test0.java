package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add('A');
		a.add("Hello");
		a.add(23.90);
		a.add("");
		a.add(true);
		a.add("Hello");
		a.add(12);
		a.add(1);
		
		System.out.println(a);
		System.out.println(a.size());
//		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
		
		for(Object b:a)
		{
			System.out.println(b);
		}

	}

}
