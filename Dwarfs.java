import java.math.BigInteger;
import java.io.*;
import java.util.*;

public class Dwarfs {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    BigInteger in = new BigInteger(f.readLine());
    System.out.println(in.mod(new BigInteger("7")));
    f.close();
  }
}
