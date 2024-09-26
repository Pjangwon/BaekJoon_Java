package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_3003 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] chessCount = {1, 1, 2, 2, 2, 8};

    for (int i = 0; i < 6; i++) {
      bw.write(chessCount[i] - Integer.parseInt(st.nextToken()) + " ");
    }
    bw.flush();
  }
}
