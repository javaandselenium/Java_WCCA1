package demo;

import accessSpecifiers.Test0;
import accessSpecifiers.Test2;
import accessSpecifiers.Test3;
import accessSpecifiers.Test4;


public class Test1 extends Test4{

	public static void main(String[] args) {
		Test0 t = new Test0();
		System.out.println("public varaible " + t.a);
		t.tea();
		Test1 t1=new Test1();
		System.out.println("Protected varaible "+t1.a);
		t1.tea();

		
		
		
	}

}
