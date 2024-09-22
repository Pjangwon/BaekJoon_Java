package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_11720 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());
    String N = br.readLine();
    int sum = 0;

    for (int i = 0; i < T; i++) {
      sum += ((int) N.charAt(i)) - '0'; //""는 문자열 ''는 문자인걸 기억할 것
    }
    bw.write(sum + "\n");
    bw.flush();
  }
}
