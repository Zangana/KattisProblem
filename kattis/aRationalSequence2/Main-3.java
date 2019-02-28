  import java.io.*;
  import java.util.*;
  import java.util.stream.*;
  import java.math.*;

  public class Main
  {
      public static void main(String args[])
      {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          scan.nextLine();
          for(int i = 0; i < t; i++)
          {
              String[] line = scan.nextLine().split("[\\s/]");
              int n = Integer.parseInt(line[1]);
              int d = Integer.parseInt(line[2]);
              int level = 0;
              while(n > 1 || d > 1)
              {
                  if(n > d)
                      n -= d;
                  else
                      d -= n;
                  level++;
              }

              System.out.println((i+1) + " " + Math.pow(2, level));
          }
      }
  }