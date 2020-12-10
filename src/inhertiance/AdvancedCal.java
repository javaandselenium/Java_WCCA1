package inhertiance;

public class AdvancedCal extends Basiccal {
	public void sinTeta() {
		System.out.println("sinteta");
	}
	
	public static void main(String[] args) {
		AdvancedCal c=new AdvancedCal();
		c.sinTeta();
		c.add(10,20);
		c.sub(10,5);
		
	}

}
