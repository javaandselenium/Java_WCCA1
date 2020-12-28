package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test12 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println("Before shuffling "+a);
		Collections.shuffle(a);
		System.out.println("After shufling "+a);
	}

}
