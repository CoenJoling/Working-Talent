public class Opdracht5 {
	public static void main(String[] args) {
		
		boolean onderdelen[]= {false, true, false, false};	
		int kosten =0;
		Auto auto1=new Auto(onderdelen);
		auto1.status();
						
		Monteur monteur1 = new Monteur();
		kosten = monteur1.repareren(auto1);
		
		auto1.status();
		System.out.println(kosten);		
	}
}

class Monteur{	
	
	
	int repareren(Auto a) {
		int kosten=0;
		if(a.motor == false) {
			kosten+=25;
			a.motor = true;
			}
		if(a.deur == false) {
			kosten+=25;
			a.deur = true;
			}
		if(a.voorruit == false) {
			kosten+=25;
			a.voorruit = true;
			}
		if(a.uitlaat == false) {
			kosten+=25;
			a.uitlaat = true;
			}
		return kosten;
		}		
}

class Auto{
	boolean motor;
	boolean deur;
	boolean voorruit;
	boolean uitlaat;
	
	Auto(boolean onderdelen[]){
		this.motor=onderdelen[0];
		this.deur=onderdelen[1];
		this.voorruit=onderdelen[2];
		this.uitlaat=onderdelen[3];
	}
	
	void status(){
		System.out.println("Status van de motor is "+this.motor);
		System.out.println("Status van de deur is "+this.deur);
		System.out.println("Status van de voorruit is "+this.voorruit);
		System.out.println("Status van de uitlaat is "+this.uitlaat);		
	} 
}