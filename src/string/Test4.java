package string;

public class Test4 {

	public static void main(String[] args) {
		String s=new String("hello");
		System.out.println(s.hashCode());
		String s1=new String("hi");
		System.out.println(s.hashCode());
		System.out.println(s.equals(s1));
		
		String s2="Java";
		System.out.println(s2.hashCode());
		String s3="selenium";
		System.out.println(s2.hashCode());
		System.out.println(s2.equals(s3));
		
		
		

	}

}
