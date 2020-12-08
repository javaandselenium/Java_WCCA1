package decisionstatements;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int numb=s.nextInt();
		if(numb%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("odd numb");
		}
	}

}
