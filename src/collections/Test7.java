package collections;

import java.util.LinkedList;

public class Test7 {

	public static void main(String[] args) {

LinkedList p=new LinkedList<>();
p.add(100);
p.add(30);
p.add(2);
p.add(400);

System.out.println(p);

for(int i=0;i<p.size();i++) {
	System.out.println(p.get(i));
}


	}

}
