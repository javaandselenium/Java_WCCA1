package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("./D");
		}
		catch(FileNotFoundException e) {
			System.out.println("handle FNFexp");
		}
		catch(ArithmeticException p) {
			System.out.println("handled AE");
		}

	}

}
