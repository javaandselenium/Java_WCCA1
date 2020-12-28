package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test14 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(100);
		a.add(20);
		a.add(90);
		a.add(300);
		a.add(40);
		System.out.println("before sorting "+a);
		Collections.sort(a);
		System.out.println("after sorting "+a);

	}

}
