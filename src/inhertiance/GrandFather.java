package inhertiance;
public class GrandFather {
	public void car() {
		System.out.println("car is the GF");
	}
}

class Father extends GrandFather {
	public void home() {
		System.out.println("home is from father");
	}
}

class Child extends Father {
	public void bike() {
		System.out.println("bike from child");
	}
}

class Mainclass {
	public static void main(String[] args) {
		Child c = new Child();
		c.home();
		c.car();
		c.bike();

		Father f = new Father();
		f.car();
		f.home();

	}
}
