package MainPackage;

public class Person {
	
	/* A person has a name, address, 
	 * phone number, and email address
	 */
	private String Name;
	private String Address;
	private String Phone_number;
	private String Email;
	
	public Person(String Name, String Address, String Phone_number, String Email) {
		this.Name = Name;
		this.Address = Address;
		this.Phone_number = Phone_number;
		this.Email = Email;
	}
	@Override
	public String toString() {
		return this.getName().getClass() + Name;
	}
	
	//Setters
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}

	public void setPhone_number(String Phone_number) {
		this.Phone_number = Phone_number;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	//Getters
	public String getName() {
		return Name;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public String getPhone_number() {
		return Phone_number;
	}

	public String getEmail() {
		return Email;
	}	
}


