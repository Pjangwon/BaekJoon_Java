package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_10809_X {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = br.readLine();

    int[] arr = new int[26];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = -1;
    }

    for (int i = 0;  i < s.length(); i++) {
      if (arr[s.charAt(i) - 'a'] == -1) {
        arr[s.charAt(i) - 'a'] = i;
      }
    }

    for (int j : arr) {
      bw.write(j + " ");
    }
    bw.flush();
  }
}