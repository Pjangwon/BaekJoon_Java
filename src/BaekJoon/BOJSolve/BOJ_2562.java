package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2562 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[9];

    for (int i = 0; i < 9; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int max = 0;
    int maxI = 0;

    for (int i = 0; i < 9; i++) {
      if (arr[i] > max) {
        max = arr[i];
        maxI = i;
      }
    }
    bw.write(max + "\n");
    bw.write((maxI+1) + "\n");
    bw.flush();
  }
}
