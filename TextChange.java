import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TextChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Trying to create a file ");
			FileOutputStream fout = new FileOutputStream("C:\\\\Users\\\\UBY2\\\\Desktop\\\\GM.txt",true);
			System.out.println("File is created ");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your text here ");
			String str = scan.nextLine();
			
			System.out.println("Received your text");
			
			byte byteArray[] = str.getBytes();
			System.out.println("Converted your text into byte array ");
			
			fout.write(byteArray);
			System.out.println("Byte Array is written to your file ");
			
			fout.close();
			System.out.println("File is closed ");
		}
		catch(FileNotFoundException e) {
			System.out.println("Problem 1: "+e);
		}
		catch(IOException e) {
			System.out.println("Problem 2 "+e);
		}
	}

}

