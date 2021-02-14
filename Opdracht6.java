import java.util.Scanner;
import java.util.Arrays;

public class Opdracht6 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Voer woord in: ");
	     String woordinput = sc.next();
	   	     
		System.out.println(woordinput);
		
		char charArray[] = woordinput.toCharArray();
		Arrays.sort(charArray);
		
		System.out.println(charArray);
	}
}