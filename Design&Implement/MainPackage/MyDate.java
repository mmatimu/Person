package MainPackage;

public class MyDate extends Person {
	
	/* Define a class named MyDate that
	 *  contains the fields year, month, 
	 *  and day
	 */
	private int Year;
	private int Month;
	private int Day;
		
	public MyDate(String Name, String Address, String Phone_number, String Email) {
		super(Name, Address, Phone_number, Email);
	}
	
	public void setDay(int Day) {
		this.Day = Day;
	}
	
	public void setMonth(int Month) {
		this.Month = Month;
	}
	
	public void setYear(int Year) {
		this.Year = Year;
	}
	
	public int getDay() {
		return Day;
	}
	
	public int getMonth() {
		return Month;
	}
	
	public int getYear() {
		return Year;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + getName();
	}
}
