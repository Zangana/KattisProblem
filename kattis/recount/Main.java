import java.io.*;
import java.util.*;

public class Main {

    public static void main(String [] args) throws Exception { 
    
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Map<String, Integer> names = new HashMap<>();
    String word; 
    int max = 0; 
    while(true) {
        word = read.readLine();
        
        if(word.equals("***")) {
            break;
        
        }
        
        if(names.containsKey(word)) {
            names.put(word,names.get(word) + 1);
        
        } else {
        
            names.put(word,1);
        
        }
        
        if(names.get(word) > max) {
            max = names.get(word);
        
        }
    
    
    }
    int count = 0; 
    for(String st: names.keySet()) {
        if(names.get(st) == max) {
        
            word = st;
            count ++;
        }
    
    }
    
    if (count ==1) { 
    
        write.write(word);
        write.write("\n");
    
    } else {
            write.write("Runoff!\n");
    
    }
    
    write.flush();
    
    }
}
