package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2751 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    boolean[] arr = new boolean[1000001];

    for (int i = 0; i < n; i++) {
      arr[Integer.parseInt(br.readLine())] = true;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i]) {
        bw.write(i + "\n");
      }
    }
    bw.flush();
  }
}
