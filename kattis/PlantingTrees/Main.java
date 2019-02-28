import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        
        int input = in.nextInt();
//        int array [] = new int[input];
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < input; i++) {

            array.add( in.nextInt());
        }
 
        Collections.sort(array);
        Collections.reverse(array);
      
        int party = 0; 
        int tem = 0;
        for(int j = 0; j < array.size(); j++) {

            tem = j + array.get(j) + 1;

            if (party < tem) {

                  party = tem; 
            }
        }
       System.out.println(party +1);
        
    }
}
