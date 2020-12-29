package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {
		public void demo() {
			try {
			FileInputStream f=new FileInputStream("./D");
			}
			catch(Exception e) {
				System.out.println("handled");
			}
		}
		
		public void sample() {
			System.out.println(10+20);
		}

		public static void main(String[] args) {
			Test6 t=new Test6();
			t.demo();
			t.sample();
			

		}


	}


