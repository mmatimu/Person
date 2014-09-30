package MainPackage;

/* This class is a subclass
 * of the Employee class.
 */
public class Staff extends Employee{
	
	private String Tittle;
	
	public Staff(String Address, String Name, String Email, String Phone_number) {
		super(Address, Name, Email, Phone_number);
	}
	
	@Override
	public String toString() {
		return this.getName().getClass() + getName(); 
	}
	
	public void setTittle(String Tittle) {
		this.Tittle = Tittle;
	}
	
	public String getTittle() {
		return Tittle;
	}
}
