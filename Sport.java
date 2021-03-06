import java.io.*;
import java.util.*;

public class Sport {
  public static void main(String[] args) throws IOException {
   BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
   int n = Integer.parseInt(f.readLine());
   int[][] grid = new int[n][n];
   for (int i = 0; i < n; i++) {
     StringTokenizer st = new StringTokenizer(f.readLine());
     for (int j = 0; j < n; j++) {
       grid[i][j] = Integer.parseInt(st.nextToken());
     }
   }
   int limit = 0;
   int i, j;
   while (limit < n) {
     i = limit; j = 0;
     while (j <= limit) {
       System.out.println(grid[i][j]);
       i--;
       j++;
     }
     limit++;
   }
  
  int jStart = 1;
  int iStart = n - 1;
  while (jStart < n) {
  	i = iStart;
  	j = jStart;
  	while (j < n) {
  		System.out.println(grid[i][j]);
  		i--;
  		j++;
  	}
  	jStart++;
  }
  }
}
