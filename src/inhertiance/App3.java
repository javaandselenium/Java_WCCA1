package inhertiance;

public class App3 extends App2{
	public void chats() {
		System.out.println("chats");
	}

	public static void main(String[] args) {
		App3 a=new App3();
		a.calls();
		a.status();
		a.chats();
		}
	}


