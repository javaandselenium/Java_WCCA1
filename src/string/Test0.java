package string;

public class Test0 {

	public static void main(String[] args) {
		String s=" HAPPY NEW YEAR 2021 ";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.concat("Bye 2020"));
		System.out.println(s.endsWith("2021 "));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.equals(" happy new year 2021 "));
		System.out.println(s.equalsIgnoreCase(" happy new year 2021 "));
		System.out.println(s.startsWith(" HAPPY"));
		System.out.println(s.contains("NEW YEAR"));
		System.out.println(s.compareToIgnoreCase(" HAPPY NEW YEAR 2021 "));

	}

}
