import java.io.*;
import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        
        for(int k = 0; k < n; k++) {
        
            int num = in.nextInt();
            
            int sumN = sumD(num) -1;            
            if (sumN == 0) {
            
                System.out.println("0");
                continue;
                
            }
            
            for (int i = num -1; i >= 0; --i) {
                
                    
                    if ( sumD(i) == sumN) {
                    
                        System.out.println(i);
                        break;
                    }
                
            }
            
           
        }
        
    }
    
    public static int sumD(int num) {
    
       int sum = 0;
       while (num > 0) {
       
            sum = sum + num % 10;
            num = num /10; 
       
       }
       return sum;
    }
    
}
