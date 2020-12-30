package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test24 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("idly");
		a.add("water");
		a.add("salt");
		a.add("vada pav");
		a.add("dosa");
		a.add("vada");
		
		ListIterator<String>itr=a.listIterator();
		while(itr.hasNext()) {
			String name=itr.next();
			System.out.println("using next "+name);
		}
		System.out.println("*******************");
		while(itr.hasPrevious()) {
			String n=itr.previous();
			System.out.println("using previous "+ n);
		}

	}

}
