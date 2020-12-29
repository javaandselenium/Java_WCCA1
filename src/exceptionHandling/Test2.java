package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		try {
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("AIOExp handled");
		}
		
		try {
		FileInputStream f=new FileInputStream("./D");
		}
		catch(FileNotFoundException p) {
			System.out.println("FNF handled");
		}
		System.out.println("hello java");
	}

}
