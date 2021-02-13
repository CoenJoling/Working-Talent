import java.util.Scanner;

public class Opdracht2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Voer woord in: ");
	     String woordinput = sc.next();
	    // System.out.println("Voer letter in: ");
	     //String letterinput = sc.next();
	     int tellerstart = 0;
	     
	     for(int x=0; x<=woordinput.length()-1;x++) {
	    	 if(woordinput.charAt(x) == 'e') {
	    		 tellerstart++;
	    	 }
	     }
	     
	     //Vraag: hoe moet ik in de bovenstaande if-statement, in regel 13, een regular experssion gebruiken om letterinput te laten werken?
	     
		System.out.println("De letter 'e' komt "+tellerstart+" keer in het opgegeven woord voor");
	}
}
