package BaekJoon.BOJSolve;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2675 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int doCount = Integer.parseInt(st.nextToken());
      String input = st.nextToken();
      for (int j = 0; j < input.length(); j++) {
        for (int k = 0; k < doCount; k++) {
          bw.write(input.charAt(j) + "");
        }
      }
      bw.newLine();
    }
    bw.flush();
  }
}
