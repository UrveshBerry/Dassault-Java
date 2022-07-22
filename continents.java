
public class FunctionTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Continents ourEarth = new Continents();
    		ourEarth.Asia();
    		ourEarth.Europe(35); 
    		int output = ourEarth.NorthAmerica (48, 10000000);
    		System.out.println("output"+output);
    		int output2 = ourEarth.Antartica();
    		System.out.println("output"+output2);
	}

}
 class Continents
 {
	 void Asia()
	 {
		 System.out.println("China has the largest population in Asia");
	 }
     void Europe(int x)
     {
    	 System.out.println("French, Spanish, German and English are the major languages in Europe");
    	 System.out.println("No of countries in Europe are"+x);
    	 
     }
     int NorthAmerica(int y,int z)
     {
    	 System.out.println("A major superpower USA is in N.A");
    	 
    	 System.out.println("No of countries"+y);
    	 System.out.println("Average population"+z);
    	 return y*z;
     }
     int Antartica()
     {
    	 System.out.println("No. of scientific research stations in Antartica");
    	 return 104;
    	 
     }
 }
  