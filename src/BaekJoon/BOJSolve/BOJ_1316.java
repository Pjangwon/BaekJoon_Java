package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_1316 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {

    int T = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i = 0; i < T; i++) {
      if (check(br.readLine())) {
        count++;
      }
    }

    bw.write(count + "\n");
    bw.flush();

  }

  static boolean check(String str) {

    boolean[] check = new boolean[26];
    int prev = 0;

    for (int i = 0; i < str.length(); i++) {

      int now = str.charAt(i);

      if (prev != now) {

        if (!check[now - 'a']) {

          prev = now;
          check[now - 'a'] = true;
        } else {

          return false;
        }
      }

    }
    return true;

  }
}