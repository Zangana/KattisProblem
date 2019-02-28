import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack();
        int size = sc.nextInt();
        sc.nextLine();
        int set = 1; 
        while(size != 0) {
            System.out.println("SET " + set);
            for(int i = 0; i < size; i++) {
                
                String word = sc.nextLine();
                if(i % 2 == 0) {
                    
                   System.out.println(word);
                }else {

                   stack.push(word); 
              }
            }
                  
        
        while(!stack.isEmpty()) {
         
           System.out.println(stack.pop());
        }
        size = sc.nextInt();
        sc.nextLine();
        set++;
       }
    }
}
