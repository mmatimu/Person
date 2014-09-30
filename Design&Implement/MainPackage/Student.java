package MainPackage;

/* This class is a subclass
 * of the Person class.
 */
public class Student extends Person{
	
	public Student(String Name, String Address, String Phone_number, String Email) {
		super(Name, Address, Phone_number, Email);
	}
	
	/* A student has a class status 
	 * (freshman, sophomore, junior, or senior). 
	 * Define the status as a constant.
	 */
	public static final int Freshman = 20;
	public static final int Sophomore = 25;
	public static final int Junior = 30;
	public static final int Senior = 35;
	
	@Override
	public String toString() {
		return this.getName().getClass() + getName();
	}
}
