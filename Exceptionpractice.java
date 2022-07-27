import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class Exceptionpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       System.out.println("Worker enters factory");
       worker work = new worker();
       try
       {
    	   work.checking();
    	   work.working();
      }
       catch(idNotMatched i)
       {
    	   System.out.println("Issue is"+i);
       }
       
	}

}
class idNotMatched extends Exception
{
	idNotMatched(String msg)
	{
    super();
	}
}
class worker
{
	boolean id;
	void checking()
	{
		if(id==false);
		{
			id=true;
		}
			System.out.println("Identity verified");
		
		
		
	}
	void working() throws idNotMatched
	{
	  if(id==false);
	  {
		  idNotMatched nm = new idNotMatched("ID not verified");
	  }
	  System.out.println("Worker starts working");
	  
	  	grind();   
	   
	}
	void grind()
	{
		System.out.println("Worker is grinding the metal");
		
		weld();
		
	}
	void weld() {
		System.out.println("Worker is welding");
		
		leaves();
	}
	void leaves()
	{
		System.out.println("Worker leaves factory");
	}
}







