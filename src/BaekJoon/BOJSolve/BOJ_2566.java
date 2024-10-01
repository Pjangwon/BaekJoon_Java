package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_2566 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] arr = new int[9][9];
    int maxInt = Integer.MIN_VALUE;
    int[] maxValue = new int[2];

    for (int i = 0; i < 9; i++) {
      StringTokenizer stt = new StringTokenizer(br.readLine());
      for (int j = 0; j < 9; j++) {
        arr[i][j] = Integer.parseInt(stt.nextToken());

        if (arr[i][j] > maxInt) {
          maxInt = arr[i][j];
          maxValue[0] = i + 1;
          maxValue[1] = j + 1;
        }
      }
    }
    bw.write(maxInt + "\n" + maxValue[0] + " " + maxValue[1]);
    bw.flush();
  }
}