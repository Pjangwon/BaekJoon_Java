package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_10250 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {

      StringTokenizer stt = new StringTokenizer(br.readLine());

      int H = Integer.parseInt(stt.nextToken());
      int W = Integer.parseInt(stt.nextToken());
      int guest = Integer.parseInt(stt.nextToken());
      int count = 0;

      for (int j = 1; j <= W; j++) {
        for (int k = 1; k <= H; k++) {
          count++;
          if (count == guest) {
            bw.write(k * 100 + j + "\n");
            break;
          }
        }
      }
    }
    bw.flush();
  }
}
