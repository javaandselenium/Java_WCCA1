package encapsulation;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpSalary());
		e.setEmpSalary(12345.90);
		System.out.println("Ater hike "+e.getEmpSalary());
		System.out.println(e.getContact());
		e.setContact("99898989");
		System.out.println("after phone number changed" +e.getContact());
		
	}

}
