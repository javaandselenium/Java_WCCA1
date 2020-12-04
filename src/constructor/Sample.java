package constructor;

public class Sample {
	
Sample(int a,String b){
System.out.println(a+b);	
}

Sample(int a,double b){
	this(10,"Hello");
System.out.println(a+b);	
}

Sample(float a){
	this(20,25.0);
System.out.println(a);	

}

public static void main(String[] args) {
	Sample s=new Sample(9.0f);
}

}
