package MainPackage;

/* This class is a subclass 
 * of the Employee class.
 */
public class Faculty extends Employee{
	
	private String OfficeHours;
	private String Rank;
	
	public Faculty(String Name, String Address, String Phone_number, String Email) {
		super(Name, Address, Phone_number, Email);
	}
	
	@Override
	public String toString() {
		return this.getName().getClass() + getName();
	}
	
	//Setters
	public void setRank(String Rank) {
		this.Rank = Rank;
	}
	
	public void setOfficeHours(String OfficeHours) {
		this.OfficeHours = OfficeHours;
	}

	//Getters
	public String getRank() {
		return Rank;
	}
	
	public String getOfficeHours() {
		return OfficeHours;
	}
}
