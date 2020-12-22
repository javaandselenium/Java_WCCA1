package encapsulation;

public class Test1 {

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.getEmailid());
		t.setEmailid("java@mail.com");
		System.out.println("after changeing "+t.getEmailid());

	}

}
