import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
		// Read in the "N" until the end case, where N=0
		int n;
        while((n = scn.nextInt()) != 0) {
            int p = 10; // p > 10
            int m; // Will store n * p, for every change in p
            int nSum = digitSum(n), mSum = 0; // Initialize the digit sum of n with the helper function, initialize the mSum to 0 for now 
            while (nSum != mSum) {
                p++; //incrementing p before loop body removes the need for another logical check or decrementing p after the loop
                m = n * p;
                mSum = digitSum(m); //Calculate the digit sum of this m value
            }
            System.out.println(p); //Exited while loop, so nSum==mSum, therefore print p
        }
    }
    
	/**
	 * Calculates the sum of the inputted number's digits
	 */
    private static int digitSum(int number) {
		//Converts the number to a string
        String digits = (new Integer(number)).toString();
        int sum = 0;
		//Split string by characters
        for (char c : digits.toCharArray()) {
			//Add the numeric value to the sum
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
