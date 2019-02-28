import java.io.*;
import java.util.*; 
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String cat = in.nextLine();
        Map<String,String> parent = new HashMap<>();
        while(true) {
            String input = in.nextLine();
            if(input.equals("-1")) {

                break;
            }
            String [] word = input.split(" ");
            for (int i = 1; i < word.length; i++) {  
                parent.put(word[i],word[0]);
            }
            
        }
        String kattin = cat + " ";
        String meaw = parent.get(cat);
        while(meaw != null) {
            
            kattin += meaw + " ";
            meaw = parent.get(meaw);
        }
        
        System.out.println(kattin.trim());
    }
}
