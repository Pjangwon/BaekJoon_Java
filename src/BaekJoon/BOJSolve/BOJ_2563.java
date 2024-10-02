package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_2563 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int[][] bigSquare = new int[100][100];

    for (int i = 0; i < N; i++) {

      StringTokenizer stt = new StringTokenizer(br.readLine());

      int base = Integer.parseInt(stt.nextToken());
      int height = Integer.parseInt(stt.nextToken());

      for (int j = base - 1; j < base + 9; j++) {
        for (int k = height - 1; k < height + 9; k++) {
          bigSquare[j][k] = 1;
        }
      }
    }

    int area = 0;

    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        if (bigSquare[i][j] == 1) {
          area++;
        }
      }
    }
    bw.write(area + "\n");
    bw.flush();
  }
}
