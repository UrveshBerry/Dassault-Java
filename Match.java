
public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		football foot = new football("SPAIN vs France","Benezma","2-0");
				foot.teams();
				foot.goal1();
				
		   football     foot2 = new football("Mbappe");
		        foot2.goal1();
		        foot.result1();
		        
           football foot3 = new football("England vs Germany","6-4");
           System.out.println("Match overview :"+foot3);
	}

}
 class football
 {
	 
	 private String matchname;
	 private String scorer;
	 private String game;
	 
	 
	 
	 
		 public football(String matchname, String game) {
		super();
		this.matchname = matchname;
		this.game = game;
	}

		@Override
		public String toString() {
			return "football [scorer=" + scorer + "]";
		}

		public football(String scorer) {
			super();
			this.scorer = scorer;
		}
		

		football(String x,String y,String z){
	 
	 
	 matchname = x;
	 scorer = y;
	 game = z;}
	 
	 void teams()
	 {
		 System.out.println("match is played between "+matchname);
		 
	 }
	 
	 football(String u)
	 {
		 scorer = u;
	 }
	 void goal1()
	 {
		 System.out.println("Goal is scored by "+scorer);
	 }
	 void result1()
	 {
		 System.out.println("Final score is "+game);
	 }
 }
 
 
 
 
 
 
