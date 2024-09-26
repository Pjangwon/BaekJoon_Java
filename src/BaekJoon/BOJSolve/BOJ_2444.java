package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2444 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i < N * 2; i++) {
      if (i <= N) {
        for (int j = i; j < N; j++) {
          bw.write(" ");
        }
        for (int j = 1; j < i * 2; j++) {
          bw.write("*");
        }
        bw.newLine();
      } else {
        for (int j = 0; j < i - N; j++) {
          bw.write(" ");
        }
        for (int j = (i - N) * 2; j < N * 2 - 1  ; j++) {
          bw.write("*");
        }
        bw.newLine();
      }
    }
    bw.flush();
  }
}
