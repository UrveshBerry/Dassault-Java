
public class sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		different diffObj = new different("Basketball","ball");
		diffObj.games();
		item itemObj = new item("Cricket","bat and ball",11);
		itemObj.printitem();
		activity act = new activity("football","soccerball",11,"studs,net,stockings");
		act.letsgo();

	}

}

class different 
{
   String name ;
   String prop;
public different(String name, String prop) {
	super();
	this.name = name;
	this.prop = prop;
}
   
   void games()
   {
	   System.out.println("Sport is "+name);
	   System.out.println("Props used are "+prop);
	   
   }
}
  class item extends different
  {
	  int players;
	public item(String name, String prop, int players) {
		super(name, prop);
		this.players = players;
	}
	  void printitem()
	  {
		  super.games();
		System.out.println("No. of players are "+players);  
	  }
  }
 class activity extends item
 {
	 String equipment;

	public activity(String name, String prop, int players, String equipment) {
		super(name, prop, players);
		this.equipment = equipment;
	}
	 void letsgo()
	 {
		 super.printitem();
		 System.out.println("Equipments used are "+equipment);
		 
		 
	 }
 }
  
   
   


