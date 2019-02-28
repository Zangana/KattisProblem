import java.io.*;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        int n; 
        while( (n = sc.nextInt()) != -1) {
            int array_hour[] = new int[n]; 
            int array_speed[] = new int[n];
            int total_hour[] = new int[n]; 
            for(int i = 0; i < n; i++) {
                int speed = sc.nextInt(); 
                int hour = sc.nextInt(); 
                array_hour[i] = hour; 
                array_speed[i] = speed; 
                if( i != 0) {
                    
                    total_hour[i] = array_hour[i] - array_hour[i-1];
                }
                if(i == 0) {
                    total_hour[i] = array_hour[i]; 
                }
            }
            int total[]= new int[n]; 
            for(int j = 0; j < n; j++) {
                total[j] = total_hour[j] * array_speed[j]; 
            }
            int total_number = 0;
            for(int k = 0; k < total.length; k++) {
                total_number += total[k];
            }
            System.out.println(total_number + " miles"); 
        }
    }
}
