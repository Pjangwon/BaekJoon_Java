package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_1676 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    bw.write(zeroCount(n) + "\n");
    bw.flush();
  }

  private static int zeroCount(int n) {
    int count = 0;
    for (int i = 5; i <= n; i *= 5) {
      count += n / i;
    }
    return count;
  }
}