package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_10814 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String[][] userData = new String[n][2];

    for (int i = 0; i < n; i++) {
      String st = br.readLine();
      userData[i][0] = st.split(" ")[0];
      userData[i][1] = st.split(" ")[1];
    }

    Arrays.sort(userData, new Comparator<String[]>() {
      @Override
      public int compare(String[] o1, String[] o2) {
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
      }
    });

    for (int i = 0; i < n; i++) {
      bw.write(userData[i][0] + " " + userData[i][1] + "\n");
    }
    bw.flush();
  }
}
