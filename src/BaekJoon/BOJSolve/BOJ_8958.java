package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_8958 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String st = br.readLine();
      int sum = 0;
      int count = 0;
      
      for (int j = 0; j < st.length(); j++) {
        if (st.charAt(j) == 'O') {
          ++count;
          sum += count;
        } else if (st.charAt(j) == 'X') {
          count = 0;
        }

      }
      bw.write(sum + "\n");

    }
    bw.flush();
  }
}
