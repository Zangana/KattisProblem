import java.io.*;
import java.util.*;

/**
* @auther Rawaz Rahim
* @ date Feb 2
* This program is counting votes if there are two people have the same result will print Runoff
* otherwise it will print name of the winner. 
*
*/
public class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in); 

        TreeMap<String,Integer> tmap = new TreeMap<String, Integer>(); // a tree which String is the key and the count of the vote is the value. 
 
        ArrayList<String> names = new ArrayList<String>();
        while(true) {         // this loop will read the value until input is equal to ***. 

            String s = sc.nextLine(); 
            if(s.equals("***")) {
               break; 
            }

            if(names.contains(s)) {
                 tmap.put(s,tmap.get(s) +1);       // if the name is in the set it will increment the vote in the TreeMap. 
            } else { 

                 tmap.put(s,1);  // if the name is not in the set it will add to the set and the Tree Map. 
                 names.add(s); 
           }

           
        }

        

       int value = 0; 
       int max = 0;
      int count = 0;
      int k = 0; 
      for(int i = 0; i < names.size(); i++) {
      
           value = tmap.get(names.get(i));
           if(value > max) {
           
               max = value;
               k++;
           }
      
      }
      
      for(int l = 0; l < names.size(); l++) {
      
           if(tmap.get(names.get(l)) == max) {
              count++;
           
           }
      
      }
      if(count > 1) {   // if they have same number of votes print Runoff.
         System.out.println("Runoff!");
      } else {
      
      System.out.println(names.get(k)); // print the winner. 

      }
    }
}
