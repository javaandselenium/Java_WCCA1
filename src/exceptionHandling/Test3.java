package exceptionHandling;

import java.io.FileInputStream;

public class Test3 {
	public void demo() {
		//try {
		FileInputStream f=new FileInputStream("fgfg");
//		}
//		catch(Exception e) {
//			System.out.println("handled");
//		}
	}
	
	public void add() {
		System.out.println("adding");
	}

	public static void main(String[] args) {
		Test3 t=new Test3();
		t.demo();
		t.add();

	}

}
