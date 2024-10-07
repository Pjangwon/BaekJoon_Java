package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2231_XXX {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int divSum = Integer.parseInt(br.readLine());
    int creator = 0;

    for (int i = 1; i <= divSum; i++) {

      int n = i;
      int result = n;

      while (n > 0) {
        result += n % 10;
        n /= 10;
      }

      if (result == divSum) {
        creator = i;
        break;
      }
    }
    bw.write(creator + "\n");
    bw.flush();
  }
}