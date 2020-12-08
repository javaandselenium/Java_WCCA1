package decisionstatements;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the time");
		int time=s.nextInt();
		if(time<=12)
		{
			System.out.println("Good morning");
		}
		else if(time<=18)
		{
			System.out.println("Good Evening");
		}
		else
		{
			System.out.println("Good night");
		}

	}

}
