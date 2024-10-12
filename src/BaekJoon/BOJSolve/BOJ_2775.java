package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2775 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] arr = new int[15][15];

    for (int i = 1; i < 15; i++) {
      arr[0][i] = i;
    }

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      int k = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());

      bw.write(function(k, n, arr) + "\n");
    }
    bw.flush();
  }

  private static int function(int k, int n, int[][] arr) {

    if (arr[k][n] != 0) {
      return arr[k][n];
    }

    if (k == 0) {
      return arr[0][n];
    }

    int result = 0;
    for (int i = 1; i <= n; i++) {
      result += function(k - 1, i, arr);
      arr[k][i] = result;
    }

    return result;
  }
}