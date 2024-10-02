package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_10798 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[][] arr = new String[5][15];

    for (int i = 0; i < 5; i++) {
      String st = br.readLine();
      for (int j = 0; j < st.length(); j++) {
        arr[i][j] = st.split("")[j];
      }
    }

    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 5; j++) {
        if (arr[j][i] != null) {
          bw.write(arr[j][i]);
        }
      }
    }
    bw.flush();
  }
}
