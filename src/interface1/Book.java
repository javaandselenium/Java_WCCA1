package interface1;

public class Book implements Pen,Paper{

	@Override
	public void redpen() {
		System.out.println("redpen");
		
	}

	@Override
	public void redPaper() {
		System.out.println("redpaper");
		
	}
	
	public static void main(String[] args) {
		Book b=new Book();
		b.redPaper();
		b.redpen();
		Pen.demo();
	}

	

}
