package methods;

public class Test8 {
	
	String name="Raju";
	String bankName="ICICI";
	int currentbalance=1000;
	int withdrawalbalance=500;
	
	public void withdrawal() {
		System.out.println(currentbalance-withdrawalbalance);
	}

	public static void main(String[] args) {
		Test8 t=new Test8();
		t.withdrawal();
		System.out.println(t.name+"balance amount in"+t.bankName);

	}

}
