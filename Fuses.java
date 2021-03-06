/* 
 * Timus OJ - 1327
 * Fuses
 */
import java.io.*;
import java.util.*;

public class Fuses {
  public static void main(String[] args) throws IOException {
     BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
     int a = Integer.parseInt(f.readLine());
     int b = Integer.parseInt(f.readLine());
     int total = (b - a) / 2;
     if (a % 2 == 1 || b % 2 == 1)
       total++;
     System.out.println(total);
     f.close();
     System.exit(0);
  }
}
