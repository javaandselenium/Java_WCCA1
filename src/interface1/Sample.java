package interface1;

public class Sample implements ATMachine{

	@Override
	public void cardSlot() {
		
		System.out.println("CARDSLOT");
	}

	@Override
	public void pinNumber() {
		System.out.println("PINNUMBER");
	}

	@Override
	public void cashWithdraw() {
		System.out.println("cash");
		
	}

	@Override
	public void cancel() {
		System.out.println("cancel");
		
	}

	public static void main(String[] args) {
		Sample s=new Sample();
		s.cardSlot();
		s.cashWithdraw();
		s.pinNumber();
		s.cancel();
	}

}
