import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        // load dimensions
        String[] dim = input.nextLine().split(" ");
        int height = Integer.parseInt(dim[0]);
        int width = Integer.parseInt(dim[1]);
        
        // load 2d array
        boolean[][] array = new boolean[height][width];
        for (int row = 0; row < height; row++) {
            String line = input.nextLine();
            for (int col = 0; col < width; col++) {
                array[row][col] = line.toCharArray()[col] == '#';
            }
        }
        
        int amoebas = 0;
        boolean[] checked = new boolean[height * width];
        
        // loop over all locations
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
            
                // only continue if the location has a # and has not been checked
                if (array[row][col] && !checked[(row * width) + col]) {
                    
                    int currentRow = row, currentCol = col;
                    while (!checked[currentRow * width + currentCol]) {
                        checked[currentRow * width + currentCol] = true;
                        
                        boolean connectedNeighborFound = false;
                        
                        // iterate over neighbors
                        for (int i = -1; i < 2; i++) {
                            for (int j = -1; j < 2;  j++) {
                                // skip itself when checking neighbors 
                                if (i != 0 || j != 0) {
                                    // make sure no values are out of bounds
                                    if ((currentCol + j) >= 0 && (currentRow + i) < height && (currentCol + j) < width && (currentRow + i) >= 0) {
                                        int val = (currentRow + i) * width + (currentCol + j);
                                        
                                        // look for a connected neighbor that is not part of another ameoba
                                        if (array[currentRow + i][currentCol + j] && !checked[val]) {
                                            currentRow += i;
                                            currentCol += j;
                                            connectedNeighborFound = true;
                                        }
                                    }
                                }
                                
                                if (connectedNeighborFound) break;
                            }
                        }
                    }
                    
                    // if the code broke from this loop we should have found a connected shape
                    amoebas++;
                }
            }
        }
        
            
        System.out.println(amoebas); // output
    }
    
}    
