package decisionstatements;

public class Test10 {

	public static void main(String[] args) {
		int atmpin = 1234;
		int balAmount = 500;

		if (atmpin == 123) {
			System.out.println("crrt pin");
			if (balAmount >= 500) {
				System.out.println("Withdraw amount");
			} else {
				System.out.println("do not withdraw the amount");
			}
		}

		else {
			System.out.println("Thank for visiting ATM");
		}
	}

}
