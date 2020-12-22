package encapsulation;

public class Employee {
	private String empName="Johnny";
	private int empId=1234;
	private double empSalary=2345678.89;
	private String contact="89765565666";
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	
	

}
