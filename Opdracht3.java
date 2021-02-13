public class Opdracht3 {
	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4};
		int start=0;
		
		for (int x=0; x<=a1.length-1;x++) {
			start = start + a1[x];
		}
		
		System.out.println(start);
		
	}

}