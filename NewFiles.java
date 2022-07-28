import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.println("Trying to open the file...");
			FileInputStream fin = new FileInputStream("C:\\Users\\UBY2\\Desktop\\notes.txt");
		System.out.println("File is open ");
		byte b =(byte) fin.read();
		
		while(b!=-1)
		{
			System.out.print((char)b);
			b = (byte)fin.read();
			Thread.sleep(10);
		}
		
		System.out.println("Trying to close the file ");
		fin.close();
		System.out.println("File is closed ");
		
		}
		catch(FileNotFoundException e) {
			System.out.println("Problem 1: "+e);
		}
		catch(IOException e) {
			System.out.println("Problem 2 "+e);
		}
		
        catch(InterruptedException e)
		{
       	 System.out.println("Problem 3 "+e);

		}
	}

}	
