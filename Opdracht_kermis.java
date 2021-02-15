import java.util.Scanner;

public class Opdracht_kermis {
	public static void main(String[] args) {
		
		
		Attractie kermis = new Attractie();
		kermis.draaien();
		
		
	}

}

class Attractie{
	
	void draaien() {
		boolean draaienMaster=true;
		while (draaienMaster=true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Welkom op de kermis! In welke attractie wil je gaan? (1-6)");
			String keuze = sc.next();
			int intkeuze=Integer.parseInt(keuze)-1;		
			String attractie [] = {"botsauto","spin","spiegelpaleis","spookhuis","hawaii","ladderklimmen"};
			System.out.println("Veel plezier in: "+attractie[intkeuze]);
		if (draaienMaster=false) {
			System.out.println("De kermis is gestopt");
			break;
		}
		}
			
		}
}

class botsauto extends Attractie{
	
}

class spin extends Attractie{
	
}

class spiegelpaleis extends Attractie{
	
}

class spookhuis extends Attractie{
	
}

class hawaii extends Attractie{
	
}

class ladderklimmen extends Attractie{
	
}