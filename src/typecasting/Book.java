package typecasting;

public class Book extends Paper {
	
	public void redBook() {
		System.out.println("redbook");
	}
	
	public void blueBook() {
		System.out.println("bluebook");
	}
	
	public static void main(String[] args) {
		Paper p=new Book();
		p.bluePaper();
		p.redPaper();
		
		Book b=(Book)p;
		b.blueBook();
		b.redBook();
		b.redBook();
		b.blueBook();
		
		
	}

}
