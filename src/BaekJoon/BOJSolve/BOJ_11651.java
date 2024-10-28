package BaekJoon.BOJSolve;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_11651 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[][] matrixLoc = new int[n][2];

    for (int i = 0; i < n; i++) {
      String st = br.readLine();
      matrixLoc[i][0] = Integer.parseInt(st.split(" ")[0]);
      matrixLoc[i][1] = Integer.parseInt(st.split(" ")[1]);
    }

    Arrays.sort(matrixLoc, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if (o1[1] == o2[1]) {
          return o1[0] - o2[0];
        }
        return o1[1] - o2[1];
      }
    });

    for (int i = 0; i < n; i++) {
      bw.write(matrixLoc[i][0] + " " + matrixLoc[i][1] + "\n");
    }
    bw.flush();
  }
}
