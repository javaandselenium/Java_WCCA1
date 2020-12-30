package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test23 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("idly");
		a.add("water");
		a.add("salt");
		a.add("vada pav");
		a.add("dosa");
		a.add("vada");
		
	System.out.println(a);
	ListIterator<String> itr=a.listIterator();
	while(itr.hasNext()) {
		String name=itr.next();
		System.out.println(name);
		if(name=="salt") {
			itr.remove();
		}
		
	}
	System.out.println(a);	
	
	ListIterator<String>l=a.listIterator();
	while(l.hasPrevious()) {
		String n=l.previous();
		System.out.println("priniting previous "+n);
	}

	}

}
