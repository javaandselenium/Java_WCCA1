package constructor;

public class Test1 {
	
	public void add() {
		System.out.println("adding");
	}
	
	Test1(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.add();

	}

}
