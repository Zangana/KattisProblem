import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        int n,m,i;
        Scanner in = new Scanner(System.in); 
 
        n = in.nextInt();
        m = in.nextInt();

        int map [] = new int [n*m + 1];
        int k = 0;
        for ( i = 0; i < n * m ; i += m) {
            int number = in.nextInt();
           
            while (number > 0) {
              map [k] = number % 10;
              number = number / 10; 
              k++;
            }
        }
        
        System.out.println( coast_search(map,n,m));
       
    }

    public static int coast_search(int map [], int n, int m) {

      int len = 0;
      int i = 0; 
      int j = 0; 

    for (i = 0, j = 0; j < m; j++) /* north side */
        len = coast_search(map, n, m, i, j, len);
    for (j = m - 1; i < n; i++)    /* east side */
        len = coast_search(map, n, m, i, j, len);
    for (i = n - 1; j >= 0; j--)   /* south side */
        len = coast_search(map, n, m, i, j, len);
    for (j = 0; i >= 0; i--)       /* west side */
         len = coast_search(map, n, m, i, j, len);
      return len;
    }

    public static int coast_search(int map [], int n, int m, int i, int j, int len) {


       int offset = i * m + j;
 
       /* if visited ('2') */
    if (map[offset] == 2)
        return len;

    /* if land ('1') */
    if (map[offset] == 1)
        return len + 1;

    /* set as visited ('2') */
    map[offset] = 2;

    /* if coast */
    if (i > 0)     /* north */
        len = coast_search(map, n, m, i - 1, j, len);
    if (i < n - 1) /* south */
        len = coast_search(map, n, m, i + 1, j, len);
    if (j > 0)     /* west */
        len = coast_search(map, n, m, i, j - 1, len);
    if (j < m - 1) /* east */
        len = coast_search(map, n, m, i, j + 1, len);

      return len;
    }
}
