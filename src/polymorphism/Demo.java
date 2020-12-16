package polymorphism;

public class Demo {

	public static void main(String[] args) {
		Ecommerce e;
		e=new Amazon();
		e.shopping();
		e=new Myntra();
		e.shopping();
		e=new Flipkart();
		e.shopping();
		

	}

}
