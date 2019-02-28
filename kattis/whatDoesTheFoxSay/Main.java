import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        int size = in.nextInt();
        in.nextLine();
        
        for(int i = 0; i < size; i++) {
        String sentence = in.nextLine();
        List<String> list = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        ArrayList<String> remove = new ArrayList<String>();
        while(true) {

            String word = in.nextLine();

            if(word.equals("what does the fox say?")){

                break;
            }

       
            String [] animal = word.split(" ");

            for(int j = 0; j < animal.length; j++) {

                if(animal[j].equals("goes")) {

                    remove.add(animal[j + 1]);
                }
            }
        } 
         list.removeAll(remove);
        for(int k = 0; k < list.size(); k++) {
            if(k != list.size() - 1) 
                System.out.print(list.get(k) + " ");
        }
        System.out.print(list.get((list.size() -1 ))); 
        System.out.print("\n");
   
        } 

    }
}
