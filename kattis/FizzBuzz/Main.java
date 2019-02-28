import java.io.*;
import java.util.*;
/**
* @author: Rawaz Rahim
* This is program calculate if the number is divide by x will print fizz, y will print buzz or both will
* print fizzbuzz. it will print the number if it is not divisible by x or y. 
*/
public class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       
       int x = sc.nextInt();  // getting value of x. 
       int y = sc.nextInt();  // getting value of y. 
       int n = sc.nextInt();  // getting value of n which is the last number. 
       for(int i = 1; i <= n; i++)
       {
           if((i % x) == 0 && (i % y) == 0) {
              System.out.println("FizzBuzz");
           }else if((i % x) == 0) {
              System.out.println("Fizz");
           }else if((i % y) == 0) {
              System.out.println("Buzz");
           }else {
              System.out.println(i);
           }
       }
    }
}
