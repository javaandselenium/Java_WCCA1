package decisionstatements;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		
		if(age>=18)
		{
			System.out.println("eligible to cast vote");
		}
		else
		{
			System.out.println("not eligible to cast vote");
		}

	}

}
