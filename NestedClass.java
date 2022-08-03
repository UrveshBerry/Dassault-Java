
public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company comp1 = new Company("Jio","Mumbai","HR");
		Company comp2 = new Company("Trends","Bangalore","Finance");
		Company comp3 = new Company("Digital","Delhi","Sales");
		

	}

}


class Company
{
	String brand;
	String Location;
	String Dept;
	
	private Employee emp1 = new Employee("Pranav","Colaba",105030);
	private Employee emp2 = new Employee("Rohit","Airport road",106030);
	private Employee emp3 = new Employee("Pranay","Sarojini",105440);
	
	public Company(String brand, String location, String dept) {
		super();
		this.brand = brand;
		Location = location;
		Dept = dept;
	}
	
	

class Employee
{
	String Name;
	String Address;
	int Employeeid;
	public Employee(String name, String address, int employeeid) {
		super();
		Name = name;
		Address = address;
		Employeeid = employeeid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}
	
 }
	
	static class Level
	{
		String Designation;
		int salary;
	}
}
