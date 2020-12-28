package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test13 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println("Before swapping "+a);
		//Collections.swap(a,0,a.size()-1);
		Collections.swap(a,1,a.size()-2);
		System.out.println("After swapping "+a);

	}

}
