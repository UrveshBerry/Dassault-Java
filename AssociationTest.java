
public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Group grp = new Group("Tata","Ratan Tata");
		grp.printGroup();
      Manager md = new Manager("Adam","14","70000");
      machines mc = new machines("CNC","80000","10");
      workers ws = new workers("Diploma","5","25");
      rawmaterials rs = new rawmaterials(" Steel ore ","B");
      
      Company comp = new Company("Tata","Ratan Tata",md,"Steel Plant");
      Steel mysteel = comp.make(rs,ws,mc);
      mysteel.showsteel();
      
	}

}
class Group
{
	String company;
	String owner;
	public Group(String company, String owner) {
		super();
		this.company = company;
		this.owner = owner;
	}
	void printGroup()
	{
		System.out.println("---------Company Info ------");
		System.out.println("Parent Company is "+company);
		System.out.println("Owner of the company is "+owner);
		
	}
}
class Company extends Group
{
	Manager md;
	String companyType;
	public Company(String company, String owner, Manager md, String companyType) {
		super(company, owner);
		this.md = md;
		this.companyType = companyType;
	}
	Steel make(rawmaterials m,workers w,machines ma)
	{
		System.out.println("Raw material of"+m.name+"is used ");
		System.out.println("Workers have experience of "+w.age+" years");
		System.out.println("Warranty of machines used is "+ma.warranty+" years");
		Steel makesteel = new Steel(1500.85,93.45);
		return makesteel;
				
	}
	
	
}

class rawmaterials
{
	String name;
	String grade;
	public rawmaterials(String name, String grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
}

class workers
{
	String qualification;
	String experience;
	String age;
	public workers(String qualification, String experience, String age) {
		super();
		this.qualification = qualification;
		this.experience = experience;
		this.age = age;
	}
	
}

class machines
{
	String machinetype;
	String cost;
	String warranty;
	public machines(String machinetype, String cost, String warranty) {
		super();
		this.machinetype = machinetype;
		this.cost = cost;
		this.warranty = warranty;
	}
	
}
class Steel
{
	double amount;
	double cost;
	double bill;
	public Steel(double amount, double cost) {
		super();
		this.amount = amount;
		this.cost = cost;
		this.bill=amount  * cost;
	}
	void showsteel()
	{
		System.out.println("------------FINAL RECEIPT------------");
		System.out.println("AMount of steel produced is "+amount);
		System.out.println("Selling price of steel would be "+cost);
		System.out.println("Total bill of steel is "+bill);
	}
}
class Manager
{
	String Name1;
	String experience1;
	String salary;
	public Manager(String name1, String experience1, String salary) {
		super();
		Name1 = name1;
		this.experience1 = experience1;
		this.salary = salary;
	}
	
     
}