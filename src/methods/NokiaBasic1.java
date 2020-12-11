package methods;

public class NokiaBasic1 extends NokiaBasic{

public void camera() {
	System.out.println("back and front");
	super.camera();
}

public static void main(String[] args) {
	NokiaBasic1 n=new NokiaBasic1();
	n.camera();
}
}
