package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_15829 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    char[] qeury = br.readLine().toCharArray();

    long hashing = 0;

    for (int i = 0; i < N; i++) {
      hashing += ((int) qeury[i] - 96) * Math.pow(31, i);
    }
    bw.write(hashing + "\n");
    bw.flush();
  }
}
