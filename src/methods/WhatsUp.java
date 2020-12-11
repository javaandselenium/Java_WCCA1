package methods;

public class WhatsUp {

	public void status() {
		System.out.println("Message");
	}

}

class Whatsup1 extends WhatsUp{
	public void status() {
		System.out.println("photos and videos");
		
	}
}

class Whatsup2 extends Whatsup1{
	public void status() {
		System.out.println("documents");
		
	}
}
