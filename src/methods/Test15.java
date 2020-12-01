package methods;

public class Test15 {
	public static void serach(String email) {
		System.out.println(email);
	}

	public static void serach(String keywords, String name) {
		System.out.println(keywords + " " + name);

	}

	public static void serach(int numb, String cc) {
		System.out.println(numb + " " + cc);
	}

	public static void serach(int sl, double d) {
		System.out.println(sl + " " + d);
	}

	public static void main(String[] args) {
	Test15.serach(12,"bharani@gmai.com");
	Test15.serach("abc","abc@gmail.com");

	}

}
