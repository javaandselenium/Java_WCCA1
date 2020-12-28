package collections;

import java.util.TreeSet;

public class Test16 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet<>();
		t.add(100);
		t.add(20);
		t.add(30);
		t.add(500);
		t.add(30);
		System.out.println(t);
		System.out.println(t.descendingSet());

	}

}
