package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2444 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N - 1; i++) {

      for (int j = i; j < N - 1; j++) {
        bw.write(" ");
      }

      for (int j = 0; j < i * 2 + 1; j++) {
        bw.write("*");
      }
      bw.write("\n");
    }

    for (int i = 0; i < N*2-1; i++) {
      bw.write("*");
    }
    bw.write("\n");

    for (int i = N-1; i > 0; i--) {

      for (int j = 0; j < N-i; j++) {
        bw.write(" ");
      }
      for (int j = 0; j < i*2-1; j++) {
        bw.write("*");
      }
      bw.write("\n");
    }

    bw.flush();
  }
}
