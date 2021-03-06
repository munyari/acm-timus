/*
 * Timus OJ - 1585
 * Penguins
 */
import java.io.*;
import java.util.*;

public class Penguins {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    String[] penguins = new String[n];
    for (int i = 0;  i< n; i++)
      penguins[i] = f.readLine();
    Arrays.sort(penguins);
    String most = penguins[0];
    int max = 1;
    int current = 1;
    for (int i = 1; i < n; i++) {
      if (penguins[i].equals(penguins[i - 1])) {
        current++;
        if (current > max) {
          max = current;
          most = penguins[i];
        }
      }
      else
        current = 1;
    }
    System.out.println(most);
    f.close();
    System.exit(0);
  }
}
