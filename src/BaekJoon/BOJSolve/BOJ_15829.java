package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_15829 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int M = 1234567891;

    char[] qeury = br.readLine().toCharArray();

    long hashing = 0;
    long power = 1;

    for (int i = 0; i < N; i++) {
      hashing += (qeury[i] - 'a' + 1) * power;
      power = (power * 31) % M;
    }
    bw.write(hashing % M + "\n");
    bw.flush();
  }
}