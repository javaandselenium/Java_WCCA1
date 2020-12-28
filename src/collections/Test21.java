package collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Test21 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer>h=new LinkedHashMap<String,Integer>();
		h.put("Ram",123);
	    h.put("Jam",123);
	    h.put("Jam",123);
	    h.put("Dam",899);
	    h.put("Gam",789);
	    System.out.println(h);
	}

}
