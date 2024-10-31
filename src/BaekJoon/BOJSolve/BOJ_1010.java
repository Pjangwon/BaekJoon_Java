package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_1010 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      StringTokenizer stt = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(stt.nextToken());
      int m = Integer.parseInt(stt.nextToken());

      long result = combination(m, n);

      bw.write(result + "\n");
    }

    bw.flush();
  }

  private static long combination(int m, int n) {
    if (n == 0 || m == n) {
      return 1;
    }

    long result = 1;
    for (int i = 0; i < n; i++) {
      result *= (m - i);
      result /= (i + 1);
    }

    return result;
  }
}
