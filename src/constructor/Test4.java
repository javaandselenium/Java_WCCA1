package constructor;

public class Test4 {
	String sub="Java";
	
	public void demo() {
		
		String sub="Python";
		System.out.println(sub);
		System.out.println(this.sub);
		
	}
	
	


	public static void main(String[] args) {
	Test4 t=new Test4();
	//t.demo();
	System.out.println(t.sub);
	

	}

}
