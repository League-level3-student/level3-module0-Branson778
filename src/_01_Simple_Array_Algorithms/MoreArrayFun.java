package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	printDemString(2);
}


    static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
void printDemString(int numberOfDemString) {
	String[] demString = new String[numberOfDemString];
	for (int i = 0; i < demString.length; i++) {
		demString[i] = "DemString";
		System.out.println(demString[i]);
	}
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
static void printStringDem(int numberOfStringDem) {
	String[] stringDem = new String[numberOfStringDem];
	for (int i = 0; i < stringDem.length; i++) {
		
	}
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.


    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


}
