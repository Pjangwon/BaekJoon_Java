package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_7568 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[][] userData = new int[n][2];
    int[] rankArr = new int[n];

    for (int i = 0; i < n; i++) {
      StringTokenizer stt = new StringTokenizer(br.readLine());

      userData[i][0] = Integer.parseInt(stt.nextToken());
      userData[i][1] = Integer.parseInt(stt.nextToken());
    }

    for (int i = 0; i < n; i++) {
      int rank = 1;
      for (int j = 0; j < n; j++) {
        if (i == j) {
          continue;
        }

        if (userData[i][0] < userData[j][0] && userData[i][1] < userData[j][1]) {
          rank++;
        }
      }
      rankArr[i] = rank;
    }

    for (int i : rankArr) {
      bw.write(i + "\n");
    }
    bw.flush();
  }
}
