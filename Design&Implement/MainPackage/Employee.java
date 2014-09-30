package MainPackage;

import java.util.Date;

/* This class is a subclass
 * of the Person class.
 */
public class Employee extends Person{
	
	public Employee(String Name, String Address, String Phone_number, String Email) {
		super(Name, Address, Phone_number, Email);
	}
	
	/* An employee has an office, 
	 * salary, and date hired.
	 */
	private Date DateHired = new java.util.Date();
	private String Salary;
	private String Office;
	
	@Override
	public String toString() {
		return this.getClass().getName() + getName();
	}
	
	//Setters
	public void setDateHired(Date DateHired) {
		this.DateHired = DateHired;
	}
	
	public void setOffice(String Office) {
		this.Office = Office;
	}
	
	public void setSalary(String Salary) {
		this.Salary = Salary;
	}
	
	//Getters
	public Date getDateHired() {
		return DateHired;
	}
	
	public String getSalary() {
		return Salary;
	}

	public String getOffice() {
		return Office;
	}
	
}
