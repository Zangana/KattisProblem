import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int com = 0; 

        for(int i = 0; i < size; i++) 
        {
             boolean check = false; 
             int order = sc.nextInt(); 
             for(int j = 0; j < order; j++) 
             {
                  int next = sc.nextInt(); 
                  if( j > 0 ) {
                      if( com +1 != next && check == false) {
                         System.out.println(j +1); 
                         check =true; 
                      }
                  }
                  com = next; 
             }
        }
    }
}
