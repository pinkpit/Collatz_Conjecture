package main;
import java.util.ArrayList;

public class Collatz {

	public static void main(String[] args) {
		collatzInRange(1, 100);
	}
	
	public static void collatzInRange(int bottom, int top) {
		for (int i=bottom; i<top+1; i++) {
			System.out.println(i+": "+collatzAlgorithm(i, new ArrayList<Integer>()));
			System.out.println();
		}
	}
	
	public static ArrayList<Integer> collatzAlgorithm(int numinput, ArrayList<Integer> allnums) {
		if (numinput == 1) {
			allnums.add(numinput);
			return allnums;
		}
		if (numinput % 2 == 0) {
			allnums.add(numinput);
			return collatzAlgorithm(numinput/2,allnums);
		}
		if (numinput % 2 == 1) {
			allnums.add(numinput);
			return collatzAlgorithm(numinput*3+1,allnums);
		}
		else {
			throw new IllegalArgumentException("NON-POSITIVE INTEGERS ARE NOT ALLOWED");
		}
	}

}