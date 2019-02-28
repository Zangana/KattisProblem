import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);

         int n = input.nextInt();
         
         System.out.println(Math.round(Math.ceil(Math.log(n)/Math.log(2) + 1)));
    }
}
