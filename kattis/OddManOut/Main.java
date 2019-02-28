import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 

        int size = sc.nextInt();
        
        int here = 0; 
        int count = 1;
        for(int i = 0; i < size; i++) {
             
            Set<Integer> invite = new HashSet<>();
            int problem = sc.nextInt(); 

            for(int j = 0; j < problem; j++) {
                int word = sc.nextInt();
                
               if(invite.contains(word)) {
                    invite.remove(word);
               } else {
                   invite.add(word);
                 //  System.out.println("word = " + word); 
               }
            }
          
      ///    System.out.print("Case #"+i +": "); 

          Iterator itr = invite.iterator(); 
            
          if(itr.hasNext())
             System.out.println("Case #" + count + ": " + itr.next());

       count++;  
        }

    }
}
