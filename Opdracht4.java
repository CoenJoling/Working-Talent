import java.util.Random;
import java.util.Arrays;

public class Opdracht4 {
	public static void main(String[] args) {
		Random rndm = new Random(); 
		int[] a1 = {0,0,0,0,0,0,0,0,0,0};

		for (int x=0; x<=a1.length-1; x++) {
			a1[x] = rndm.nextInt(100);	
		}
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));	
	}
	//Adcanced opdracht: met een if-statement de waardes met elkaar vergelijken. If a1[x-1] > a1[x] true a1[x-1]=a1[x] else a1[x+1]=a1[x]. Zoiets moet ik na de overige opdrachten uitwerken..
}