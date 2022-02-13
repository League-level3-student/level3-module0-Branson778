package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] base = new String[12];
		for (int i = 0; i < base.length; i++) {
			base[i] = "Base "+ (i+1);
		}
		System.out.println("------------------");
		printDemString(base);
		System.out.println("------------------");
		printStringDem(base);
		System.out.println("------------------");
		printDmtig(base);
		System.out.println("------------------");
		printRmetdsIgn(base);		
		System.out.println("------------------");

	}

	static // 2. Write a method that takes an array of Strings and prints all the Strings
			// in the array.
	void printDemString(String[] demString) {
		for (int i = 0; i < demString.length; i++) {
			//demString[i] = "DemString " + (i + 1);
			System.out.println(demString[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void printStringDem(String[] stringDem) {
		for (int i = stringDem.length; i > 0; i--) {
			//stringDem[i - 1] = "StringDem " + (i);
			System.out.println(stringDem[i - 1]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void printDmtig(String[] dmtig) {
		for (int i = 0; i < dmtig.length; i++) {
			//dmtig[i] = "Dmtig " + (i + 1);
			if (0 == i % 2) {
				System.out.println(dmtig[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
 static void printRmetdsIgn(String[] rmetdsIgn) {
	ArrayList<String> rmetdsIgnS = new ArrayList<String>(Arrays.asList(rmetdsIgn));
	 Random ran = new Random();
	 int ranInt = 0;
		// rmetdsIgn[i] = "RmetdsIgn "+ (i+1);
	 int sizes = rmetdsIgnS.size();
	 for (int i = 0; i < sizes; i++) {
		 ranInt = ran.nextInt(rmetdsIgnS.size());
		 System.out.println(rmetdsIgnS.get(ranInt));
		 rmetdsIgnS.remove(ranInt);
	}

 }
 
}
