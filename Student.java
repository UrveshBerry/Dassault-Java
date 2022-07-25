
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         result resObj = new result();
         resObj.exam(6);
         resObj.exam("Urvesh","Pass");
         resObj.exam(84,84.65);
         resObj.exam("A");
	}

}

class result{
	
	void exam(int x)
	{
		System.out.println("Roll no of student is.."+x);
		
	}
	void exam(int y,double z)
	{
		System.out.println("Marks of student is.."+y+" Percentage of student is.."+z);
		
	}
	void exam(String grade)
	{
		System.out.println("Grade of the student is...."+grade);
		
	}
	void exam(String name,String final1)
	{
		System.out.println("Name of student is..."+name+(" final result is "+final1));
	}
	
	
}