package constructor;

public class Test2 {
	
	public void demo() {
		System.out.println("demo");
	}
	//parameterized constructor
	Test2(int a,int b){
		System.out.println(a+b);
	}
	//non parameterized constructor
	Test2(){
		int a=10;
		int b=20;
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		Test2 t=new Test2(5,8);
		Test2 t1=new Test2();
		t.demo();

	}

}
