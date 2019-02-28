import java.io.*;
import java.util.*;
/**
*@Author Rawaz Rahim
* 
**/
public class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt(); 
       int num = 1;
       for (int i = 0; i < size; i++) {
       
           int number = sc.nextInt();
           String node = sc.nextLine();
           
           String [] node_number = (node.split("/"));
           String top = node_number[0];
           String bottom = node_number[1];
          
           int p = Integer.valueOf(top.trim());
           int q = Integer.parseInt(bottom);
           ArrayList<String> position = new ArrayList<String>();
           int index = 0;
          
           while(p != q) {
           
                if (p > q) {
                   
                    p -= q;
                    position.add("R");
                } else {
                
                
                    q -= p;
                    position.add("L");
                }
                
                index++;
           }
           
           int n = 0;
           for ( int j = position.size() -1; j>= 0; j--) {
           
                if (position.get(j).equals("R")) {               
                    n = (2 * (n+1));
                } else {
                    n = (2 * n + 1);
                }
           
           
           }
           System.out.print(num + " " );
           System.out.println( (n + 1) ); 
           num++;
       }
    }
}
